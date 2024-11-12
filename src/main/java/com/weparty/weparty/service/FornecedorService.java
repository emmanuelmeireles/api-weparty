package com.weparty.weparty.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.weparty.weparty.model.FornecedorModel;
import com.weparty.weparty.repository.FornecedorRepository;

@Service
public class FornecedorService {
    private final FornecedorRepository fornecedorRepository;

    public FornecedorService(FornecedorRepository fornecedorRepository) {
        this.fornecedorRepository = fornecedorRepository;
    }

    public List<FornecedorModel> getAll() {
        return fornecedorRepository.findAll();
    }

    public Optional<FornecedorModel> getById(Long id) {
        return this.fornecedorRepository.findById(id);
    }

    public FornecedorModel createFornecedor(FornecedorModel fornecedorModel) {
        return this.fornecedorRepository.save(fornecedorModel);
    }

    public void deleteFornecedor(Long id) {
        this.fornecedorRepository.deleteById(id); 
    }

    public FornecedorModel updateFornecedor(Long id, FornecedorModel fornecedorModel) {
        Optional<FornecedorModel> existingFornecedor = fornecedorRepository.findById(id);
        
        if (existingFornecedor.isPresent()) {
            FornecedorModel fornecedorToUpdate = existingFornecedor.get();
            fornecedorToUpdate.setNome(fornecedorModel.getNome()); 
            fornecedorToUpdate.setEmail(fornecedorModel.getEmail());

            return fornecedorRepository.save(fornecedorToUpdate);
        } else {
            throw new RuntimeException("Fornecedor não encontrado com o ID: " + id);
        }
    }
}
