package com.weparty.weparty.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.weparty.weparty.model.FornecedorModel;
import com.weparty.weparty.service.FornecedorService;

@RestController
@RequestMapping("api/v1/fornecedor")
public class FornecedorController {
    private final FornecedorService fornecedorService;

    public FornecedorController(FornecedorService fornecedorService) {
        this.fornecedorService = fornecedorService;
    }

    @GetMapping
    public List<FornecedorModel> getAllFornecedores() {
        return fornecedorService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public FornecedorModel createFornecedor(FornecedorModel fornecedorModel) {
        return fornecedorService.createFornecedor(fornecedorModel);
    }

    @DeleteMapping("/:{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteFornecedor(@PathVariable Long id) {
        fornecedorService.deleteFornecedor(id);
    }
}
