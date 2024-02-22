package com.nexola.apiportfolio.controllers;

import com.nexola.apiportfolio.models.dto.PortfolioDTO;
import com.nexola.apiportfolio.models.dto.UserDTO;
import com.nexola.apiportfolio.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping(value = "/{id}/portfolio")
    private ResponseEntity<PortfolioDTO> getUserPortfolio(@PathVariable String id) {
        PortfolioDTO result = service.getUserPortfolio(id);
        return ResponseEntity.ok(result);
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll() {
        List<UserDTO> dto = service.findAll();
        return ResponseEntity.ok(dto);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable String id) {
        UserDTO result = service.findById(id);
        return ResponseEntity.ok(result);
    }
}
