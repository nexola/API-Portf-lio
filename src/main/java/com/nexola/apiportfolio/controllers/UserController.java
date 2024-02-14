package com.nexola.apiportfolio.controllers;

import com.nexola.apiportfolio.dto.UserDTO;
import com.nexola.apiportfolio.dto.UserMinDTO;
import com.nexola.apiportfolio.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/portfolios")
public class UserController {

    @Autowired
    private UserService service;

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_PERSON')")
    @GetMapping(value = "/me")
    public ResponseEntity<UserMinDTO> getMe () {
        UserMinDTO dto = service.getMe();
        return ResponseEntity.ok(dto);
    }

    @PreAuthorize("hasAnyRole('ROLE_PERSON')")
    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> getPortfolio(@PathVariable Long id) {
        UserDTO dto = service.getPortfolio(id);
        return ResponseEntity.ok(dto);
    }
}
