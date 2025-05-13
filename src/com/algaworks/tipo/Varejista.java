package com.algaworks.tipo;

public class Varejista extends EmpresaFinanciavel {

    public static final double LIMITE_PARA_FATURAMENTO = 0.5;
    public static final double LIMITE_SOB_ESTOQUE = 0.2;

    private double valorTotalEstoque;

    public Varejista(String razaoSocial, double totalFaturamento, double valorTotalEstoque) {
        super(razaoSocial, totalFaturamento);
        this.valorTotalEstoque = valorTotalEstoque;
    }

    public double getValorTotalEstoque() {
        return valorTotalEstoque;
    }

    @Override
    public double calcularLimiteAprovado() {
        return (getTotalFaturamento() * LIMITE_PARA_FATURAMENTO) + (getValorTotalEstoque() * LIMITE_SOB_ESTOQUE);
    }
}
