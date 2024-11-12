public package com.weparty.weparty.models;
import java.sql.Date;



public class Contract {

    private int contratoId;
    private int eventoId;
    private int servicoId;
    private int fornecedorId;
    private int contratanteId;
    private Date dataContrato;
    private double precoFinal;
    private String statusPagamento;
    private String metodoPagamento;
    

    public Contract(int contratoId, int eventoId, int servicoId, int fornecedorId, int contratanteId, Date dataContrato, double precoFinal, String statusPagamento, String metodoPagamento){

        this.contratoId = contratoId;
        this.eventoId = eventoId;
        this.servicoId = servicoId;
        this.fornecedorId = fornecedorId;
        this.contratanteId = contratanteId;
        this.dataContrato = dataContrato;
        this.precoFinal = preco;
        this.statusPagamento = statusPagamento;
        this.metodoPagamento = metodoPagamento;
    }

    public int getContratoId(){
        return contratoId;
    }
    public void setContratoId(int contratoId){
        this.contratoId = contratoId;
    }
    public int getEventoId() {
        return eventoId;
    }
    public void setEventoId(int eventoId) {
        this.eventoId = eventoId;
    }
    public int getServicoId() {
        return servicoId;
    }
    public void setServicoId(int servicoId) {
        this.servicoId = servicoId;
    }
    public int getFornecedorId() {
        return fornecedorId;
    }
    public void setFornecedorId(int fornecedorId) {
        this.fornecedorId = fornecedorId;
    }
    public int getContratanteId() {
        return contratanteId;
    }
    public void setContratanteId(int contratanteId) {
        this.contratanteId = contratanteId;
    }
    public Date getDataContrato() {
        return dataContrato;
    }
    public void setDataContrato(Date dataContrato) {
        this.dataContrato = dataContrato;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }
    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }
    public String getStatusPagamento() {
        return statusPagamento;
    }
    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }
    public String getMetodoPagamento() {
        return metodoPagamento;
    }
    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void exibirDetalhesTansacao(){
        System.out.println("detalhe do contrato: ");
        System.out.println("Contrato ID: " + contratoId);
        System.out.println("Evento ID: " + eventoId);
        System.out.println("Fornecedor ID: " + fornecedorId);
        System.out.println("Contratante ID: " + contratanteId);
        System.out.println("Data do Contrato: " + dataContrato);
        System.out.println("Preço Final: R$" + precoFinal);
        System.out.println("Status do Pagamento: " + statusPagamento);
        System.out.println("Método de Pagamento: " + metodoPagamento);
    }

    public void validacaoPagamento(){
        return "Pago".equalsIgnoreCase(statusPagemento);
    }
}

