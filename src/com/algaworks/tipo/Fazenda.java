package com.algaworks.tipo;

public class Fazenda extends EmpresaFinanciavel{

    public static final int TAMANHO_MINIMO_PARA_LIMITE_MAIOR = 5;
    public static final double LIMITE_BONUS = 0.2;
    public static final double LIMITE_BASE = 0.5;

    private double hectares;

    public Fazenda(String razaoSocial, double totalFaturamento, double hectares) {
        super(razaoSocial, totalFaturamento);
        this.hectares = hectares;
    }

    @Override
    public double calcularLimiteAprovado() {
        double valorAprovado = getTotalFaturamento()*LIMITE_BASE;

        if (hectares >= TAMANHO_MINIMO_PARA_LIMITE_MAIOR) {
            return valorAprovado * (1+LIMITE_BONUS);
        }
        return valorAprovado;
    }
}
