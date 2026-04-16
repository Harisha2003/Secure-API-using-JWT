package com.example.jwtdemo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello(@AuthenticationPrincipal UserDetails userDetails) {
        return ResponseEntity.ok("Hello, " + userDetails.getUsername() + "! Your JWT is valid.");
    }
}
