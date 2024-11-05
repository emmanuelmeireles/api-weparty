package com.weparty.weparty.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExemploController {
    @GetMapping("/public")
    public String publicEndpoint() {
        return "Este é um endpoint público.";
    }

    @GetMapping("/user")
    public String userEndpoint() {
        return "Bem-vindo, usuário com role USER!";
    }

    @GetMapping("/admin")
    public String adminEndpoint() {
        return "Bem-vindo, administrador com role ADMIN!";
    }

    @GetMapping("/")
    public String home() {
        return "Página inicial - Você está autenticado!";
    }
}
