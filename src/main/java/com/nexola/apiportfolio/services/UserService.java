package com.nexola.apiportfolio.services;

import com.nexola.apiportfolio.models.dto.PortfolioDTO;
import com.nexola.apiportfolio.models.dto.UserDTO;
import com.nexola.apiportfolio.models.entities.Role;
import com.nexola.apiportfolio.models.entities.User;
import com.nexola.apiportfolio.models.projections.UserDetailsProjection;
import com.nexola.apiportfolio.repositories.UserRepository;
import com.nexola.apiportfolio.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Transactional(readOnly = true)
    public List<UserDTO> findAll() {
        List<User> result = repository.findAll();
        return result.stream().map(UserDTO::new).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public UserDTO findById(String id) {
        User user = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Usuário não encontrado")
        );
        return new UserDTO(user);
    }

    @Transactional(readOnly = true)
    public PortfolioDTO getUserPortfolio(String id) {
        User user = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado")
        );

        return new PortfolioDTO(user.getPortfolio());
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
}
