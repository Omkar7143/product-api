package com.zestindia.productapi.controller;

import com.zestindia.productapi.dto.request.LoginRequest;
import com.zestindia.productapi.dto.request.RegisterRequest;
import com.zestindia.productapi.dto.response.ApiResponse;
import com.zestindia.productapi.dto.response.AuthResponse;
import com.zestindia.productapi.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<ApiResponse<AuthResponse>> register(
            @Valid @RequestBody RegisterRequest request) {
        return ResponseEntity.ok(
                ApiResponse.success("User registered successfully", authService.register(request)));
    }

    @PostMapping("/login")
    public ResponseEntity<ApiResponse<AuthResponse>> login(
            @Valid @RequestBody LoginRequest request) {
        return ResponseEntity.ok(
                ApiResponse.success("Login successful", authService.login(request)));
    }

    @PostMapping("/refresh")
    public ResponseEntity<ApiResponse<AuthResponse>> refresh(
            @RequestParam String refreshToken) {
        return ResponseEntity.ok(
                ApiResponse.success("Token refreshed", authService.refreshToken(refreshToken)));
    }
}