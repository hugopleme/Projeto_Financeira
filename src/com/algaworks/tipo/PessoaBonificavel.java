package com.algaworks.tipo;

public interface PessoaBonificavel extends ClienteFinanciavel {

    double calcularBonus(double metaPercentualAlcancada);
}
