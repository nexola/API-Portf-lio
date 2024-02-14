package com.nexola.apiportfolio.controllers;

import com.nexola.apiportfolio.dto.UserDTO;
import com.nexola.apiportfolio.dto.UserInsertDTO;
import com.nexola.apiportfolio.dto.UserMinDTO;
import com.nexola.apiportfolio.services.PortfolioService;
import com.nexola.apiportfolio.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(value = "/portfolios")
public class UserController {

    @Autowired
    private UserService service;

    @Autowired
    private PortfolioService portfolioService;

    @PostMapping
    public ResponseEntity<UserMinDTO> insert(@RequestBody @Valid UserInsertDTO dto) {
        UserMinDTO newDto = service.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(newDto.getId()).toUri();
        return ResponseEntity.created(uri).body(newDto);
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_PERSON')")
    @GetMapping(value = "/me")
    public ResponseEntity<UserMinDTO> getMe () {
        UserMinDTO dto = service.getMe();
        return ResponseEntity.ok(dto);
    }

    @PreAuthorize("hasAnyRole('ROLE_PERSON')")
    @GetMapping(value = "/{id}")
    public ResponseEntity<UserDTO> getPortfolio(@PathVariable Long id) {
        UserDTO dto = portfolioService.getPortfolio(id);
        return ResponseEntity.ok(dto);
    }
}
