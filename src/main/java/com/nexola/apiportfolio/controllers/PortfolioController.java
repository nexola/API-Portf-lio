package com.nexola.apiportfolio.controllers;

import com.nexola.apiportfolio.models.dto.PortfolioDTO;
import com.nexola.apiportfolio.services.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/portfolio")
public class PortfolioController {

    @Autowired
    private PortfolioService service;

    @GetMapping
    public ResponseEntity<List<PortfolioDTO>> findAll(){
        List<PortfolioDTO> resultList = service.findAll();
        return ResponseEntity.ok(resultList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<PortfolioDTO> getPortfolio(@PathVariable String id) {
        PortfolioDTO result = service.getPortfolio(id);
        return ResponseEntity.ok(result);
    }
}
