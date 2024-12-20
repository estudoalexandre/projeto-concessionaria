package br.com.fecaf.model;

public class VeiculoModel {

    private static int contadorId = 1;

    private int id;
    private String marca;
    private String modelo;
    private String tipoVeiculo;
    private int anoFabricacao;
    
    private double preco;
    private String statusDisponibilidade;

    private String cor;
    private int quilometragem;
    private String tipoCombustivel;
    private int numeroPortas;
    private String tipoCambio;

     public VeiculoModel(String marca, String modelo, String tipoVeiculo, int anoFabricacao, double preco,
                        String statusDisponibilidade, String cor, int quilometragem, String tipoCombustivel,
                        int numeroPortas, String tipoCambio) {
        this.id = contadorId++;
        this.marca = marca;
        this.modelo = modelo;
        this.tipoVeiculo = tipoVeiculo;
        this.anoFabricacao = anoFabricacao;
        this.preco = preco;
        this.statusDisponibilidade = statusDisponibilidade;
        this.cor = cor;
        this.quilometragem = quilometragem;
        this.tipoCombustivel = tipoCombustivel;
        this.numeroPortas = numeroPortas;
        this.tipoCambio = tipoCambio;
    }

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getStatusDisponibilidade() {
        return statusDisponibilidade;
    }

    public void setStatusDisponibilidade(String statusDisponibilidade) {
        this.statusDisponibilidade = statusDisponibilidade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(String tipoCambio) {
        this.tipoCambio = tipoCambio;
    }



}
