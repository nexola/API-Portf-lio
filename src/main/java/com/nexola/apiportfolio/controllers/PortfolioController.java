package com.nexola.apiportfolio.controllers;

import com.nexola.apiportfolio.models.dto.PortfolioDTO;
import com.nexola.apiportfolio.services.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/portfolio")
public class PortfolioController {

    @Autowired
    private PortfolioService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<PortfolioDTO> getPortfolio(@RequestParam String id) {
        PortfolioDTO result = service.getPortfolio(id);
        return ResponseEntity.ok(result);
    }
}
