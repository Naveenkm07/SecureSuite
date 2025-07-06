package com.example.backend.controller;

import com.example.backend.model.User;
import com.example.backend.service.AuthService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private static final Logger logger = LoggerFactory.getLogger(AuthController.class);
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@Valid @RequestBody RegisterRequest request) {
        User user = new User();
        user.setEmail(request.email());
        user.setPassword(request.password());
        user.setUsername(request.email()); // Using email as username for simplicity
        return ResponseEntity.ok(authService.register(user));
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@Valid @RequestBody LoginRequest loginRequest) {
        logger.info("Login attempt for email: {}", loginRequest.email());
        try {
            String token = authService.authenticate(loginRequest.email(), loginRequest.password());
            User user = authService.getUserByEmail(loginRequest.email());
            logger.info("Login successful for user: {}", user.getEmail());
            return ResponseEntity.ok(new LoginResponse(token, user));
        } catch (UsernameNotFoundException e) {
            logger.error("Login failed - User not found: {}", loginRequest.email());
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(new ErrorResponse("Invalid email or password"));
        } catch (BadCredentialsException e) {
            logger.error("Login failed - Invalid credentials for user: {}", loginRequest.email());
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body(new ErrorResponse("Invalid email or password"));
        } catch (Exception e) {
            logger.error("Login failed for email: {} - Error: {}", loginRequest.email(), e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new ErrorResponse("An unexpected error occurred during login"));
        }
    }
}

record LoginRequest(String email, String password) {}
record RegisterRequest(String email, String password) {}
record LoginResponse(String token, User user) {}
record ErrorResponse(String message) {} 