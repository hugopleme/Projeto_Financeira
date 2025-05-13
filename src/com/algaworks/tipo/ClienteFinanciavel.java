package com.algaworks.tipo;

public interface ClienteFinanciavel {

    double calcularLimiteAprovado();

    default double calcularJuros(double valorSolicitado){
        if (isGrandeValor(valorSolicitado)) {
            return 1.5;
        } else if (isMedioValor(valorSolicitado)) {
            return 2.5;
        }else{
            return 3;
        }
    }

    private static boolean isMedioValor(double valorSolicitado) {
        return valorSolicitado > 500_000;
    }

    private static boolean isGrandeValor(double valorSolicitado) {
        return valorSolicitado > 1_000_000;
    }
}
