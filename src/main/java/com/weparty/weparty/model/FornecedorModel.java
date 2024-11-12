package com.weparty.weparty.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/*
Representa os profissionais e empresas que oferecem serviços ou produtos para eventos.
Atributos:
fornecedor_id (PK)
nome
email
telefone
endereco
categorias_de_servico (ex.: decoração, buffet, som)
métodos_de_pagamento (ex.: cartão, boleto, transferência)
rating (avaliação média do fornecedor com base em feedbacks dos contratantes)
Serviço/Produto
 */

@Entity
@Table(name = "fornecedor")
@Data
public class FornecedorModel {

    @Id
    protected long id;
    protected String nome;
    protected String email;
    protected String telefone;
    protected String endereco;
    protected String categoria_servico;
    protected String metodo_pagamento;
    protected long avaliacao;
    protected String servicos;
    protected String produtos;
}
