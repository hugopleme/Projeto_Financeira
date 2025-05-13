package com.algaworks.tipo;

public class Industria extends EmpresaFinanciavel {

    public static final double BONUS_EMISSAO_CO2 = 0.2;
    public static final double LIMITE_BASE = 0.5;

    private boolean compensaEmissaoCO2;

    public Industria(String razaoSocial, double totalFaturamento, boolean compensaEmissaoCO2) {
        super(razaoSocial, totalFaturamento);
        this.compensaEmissaoCO2 = compensaEmissaoCO2;
    }

    @Override
    public double calcularLimiteAprovado() {
        double valorAprovado = getTotalFaturamento() * LIMITE_BASE;

        if (compensaEmissaoCO2){
            return valorAprovado * (1+BONUS_EMISSAO_CO2);
        }
        return valorAprovado;
    }
}
