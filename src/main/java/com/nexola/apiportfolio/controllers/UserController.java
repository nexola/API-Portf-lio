package com.nexola.apiportfolio.controllers;

import com.nexola.apiportfolio.models.dto.*;
import com.nexola.apiportfolio.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService service;

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    @GetMapping(value = "/portfolio")
    public ResponseEntity<PortfolioDTO> getUserPortfolio() {
        PortfolioDTO result = service.getUserPortfolio();
        return ResponseEntity.ok(result);
    }

    @PostMapping
    public ResponseEntity<UserDTO> insert(@RequestBody @Valid UserInsertDTO dto) {
        UserDTO newDto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(newDto.getId()).toUri();
        return ResponseEntity.created(uri).body(newDto);
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER')")
    @GetMapping
    public ResponseEntity<UserMinDTO> getMe () {
        UserMinDTO dto = service.getMe();
        return ResponseEntity.ok(dto);
    }
}
