package com.nexola.apiportfolio.controllers;

import com.nexola.apiportfolio.models.dto.UserDTO;
import com.nexola.apiportfolio.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<UserDTO> findById(@RequestParam String id) {
        UserDTO result = service.findById(id);
        return ResponseEntity.ok(result);
    }
}
