package com.zestindia.productapi.service;

import com.zestindia.productapi.dto.request.LoginRequest;
import com.zestindia.productapi.dto.request.RegisterRequest;
import com.zestindia.productapi.dto.response.AuthResponse;

public interface AuthService {
    AuthResponse register(RegisterRequest request);
    AuthResponse login(LoginRequest request);
    AuthResponse refreshToken(String refreshToken);
}