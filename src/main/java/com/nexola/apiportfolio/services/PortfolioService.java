package com.nexola.apiportfolio.services;

import com.nexola.apiportfolio.models.dto.PortfolioDTO;
import com.nexola.apiportfolio.models.entities.Portfolio;
import com.nexola.apiportfolio.models.entities.User;
import com.nexola.apiportfolio.repositories.PortfolioRepository;
import com.nexola.apiportfolio.repositories.UserRepository;
import com.nexola.apiportfolio.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PortfolioService {

    @Autowired
    private PortfolioRepository repository;

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public PortfolioDTO update(PortfolioDTO dto) {
            User user = userService.authenticated();
            Portfolio portfolio = repository.findById(user.getPortfolio().getId()).orElseThrow(
                    () -> new ResourceNotFoundException("Portfólio não encontrado")
            );
            copyDtoToEntity(dto, portfolio);

            userService.validateSelf(user.getId());

            portfolio = repository.save(portfolio);

            return new PortfolioDTO(portfolio);
    }

    private void copyDtoToEntity(PortfolioDTO dto, Portfolio entity) {
        entity.setHeader(dto.getHeader());
        entity.setFooter(dto.getFooter());
        entity.setEducation(dto.getEducation());
        entity.setExperience(dto.getExperience());
    }
}

