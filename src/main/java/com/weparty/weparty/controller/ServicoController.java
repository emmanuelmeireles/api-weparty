package com.example.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@RestController
@RequestMapping("/api/servicos")
public class ServiceController {
    
    @GetMapping
    public ResponseEntity<List<Service>> getAllServices() {
        return ResponseEntity.ok(services);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Service> getServiceById(@PathVariable int id) {
        return services.stream()
                .filter(service -> service.getId() == id)
                .findFirst()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping
    public ResponseEntity<Service> createService(@RequestBody Service service) {
        service.setId(services.size() + 1); // Simulando auto incremento
        services.add(service);
        return ResponseEntity.ok(service);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Service> updateService(@PathVariable int id, @RequestBody Service updatedService) {
        return services.stream()
                .filter(service -> service.getId() == id)
                .findFirst()
                .map(existingService -> {
                    existingService.setNome(updatedService.getNome());
                    existingService.setTipo(updatedService.getTipo());
                    existingService.setDescricao(updatedService.getDescricao());
                    existingService.setPreco(updatedService.getPreco());
                    existingService.setImagens(updatedService.getImagens());
                    existingService.setContratanteId(updatedService.getContratanteId());
                    return ResponseEntity.ok(existingService);
                })
                .orElse(ResponseEntity.notFound().build());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteService(@PathVariable int id) {
        boolean removed = services.removeIf(service -> service.getId() == id);
        return removed ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
