package com.algaworks.tipo;

public abstract class Empresa{

    public static final double TAXA_DE_JUROS = 0.1;

    private String razaoSocial;
    private double totalFaturamento;

    public Empresa(String razaoSocial, double totalFaturamento) {
        this.razaoSocial = razaoSocial;
        this.totalFaturamento = totalFaturamento;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public double getTotalFaturamento() {
        return totalFaturamento;
    }

    public abstract double calcularLimiteAprovado();

}
