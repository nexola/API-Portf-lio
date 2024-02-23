package com.nexola.apiportfolio.controllers;

import com.nexola.apiportfolio.models.dto.PortfolioDTO;
import com.nexola.apiportfolio.services.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/portfolio")
public class PortfolioController {

    @Autowired
    private PortfolioService service;

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    @PutMapping
    public ResponseEntity<PortfolioDTO> update(@RequestBody PortfolioDTO dto) {
        PortfolioDTO newDto = service.update(dto);
        return ResponseEntity.ok(newDto);
    }
}
