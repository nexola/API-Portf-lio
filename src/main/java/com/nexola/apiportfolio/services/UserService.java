package com.nexola.apiportfolio.services;

import com.nexola.apiportfolio.models.dto.*;
import com.nexola.apiportfolio.models.embedded.Author;
import com.nexola.apiportfolio.models.entities.Portfolio;
import com.nexola.apiportfolio.models.entities.Role;
import com.nexola.apiportfolio.models.entities.User;
import com.nexola.apiportfolio.models.projections.UserDetailsProjection;
import com.nexola.apiportfolio.repositories.PortfolioRepository;
import com.nexola.apiportfolio.repositories.RoleRepository;
import com.nexola.apiportfolio.repositories.UserRepository;
import com.nexola.apiportfolio.services.exceptions.ForbiddenException;
import com.nexola.apiportfolio.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PortfolioRepository portfolioRepository;

    @Transactional(readOnly = true)
    public PortfolioDTO getUserPortfolio() {
        User user = authenticated();

        validateSelf(user.getId());

        return new PortfolioDTO(user.getPortfolio());
    }

    @Transactional
    public UserDTO insert(UserInsertDTO dto) {
        User entity = new User();
        entity = createInsertUser(entity, dto);
        return new UserDTO(entity);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetailsProjection details = repository.searchUserAndRolesByEmail(username);
        if (details == null) throw new UsernameNotFoundException("Usuário não encontrado");

        User user = new User();
        user.setEmail(username);
        user.setPassword(details.getPassword());
        for (Role role : details.getRoles()) {
            user.getRoles().add(role);
        }

        return user;
    }

    protected User authenticated() {
        try {
            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
            Jwt jwtPrincipal = (Jwt) authentication.getPrincipal();
            String username = jwtPrincipal.getClaim("username");
            return repository.findByEmail(username).get();
        }
        catch (Exception e) {
            throw new UsernameNotFoundException("Usuário inválido");
        }
    }

    @Transactional
    public UserMinDTO getMe() {
        User user = authenticated();
        return new UserMinDTO(user);
    }

    public void validateSelf(String userId) {
        User me = authenticated();
        if (!me.getId().equals(userId)) {
            throw new ForbiddenException("Acesso negado");
        }
    }

    private void copyDtoToEntity(UserDTO dto, User entity) {
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
    }

    private User createInsertUser(User user, UserInsertDTO dto) {
        copyDtoToEntity(dto, user);
        user.getRoles().clear();
        Role role = roleRepository.findByAuthority("ROLE_USER");
        Portfolio portfolio = new Portfolio();
        portfolio = portfolioRepository.save(portfolio);
        user.getRoles().add(role);
        user.setPortfolio(portfolio);
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        user = repository.save(user);
        portfolio.setAuthor(new Author(user));
        portfolioRepository.save(portfolio);
        return user;
    }
}
