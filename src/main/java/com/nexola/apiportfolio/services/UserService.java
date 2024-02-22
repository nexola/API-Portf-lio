package com.nexola.apiportfolio.services;

import com.nexola.apiportfolio.models.dto.PortfolioDTO;
import com.nexola.apiportfolio.models.dto.UserDTO;
import com.nexola.apiportfolio.models.entities.Portfolio;
import com.nexola.apiportfolio.models.entities.User;
import com.nexola.apiportfolio.repositories.UserRepository;
import com.nexola.apiportfolio.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

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
}
