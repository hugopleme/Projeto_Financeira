package com.algaworks.tipo;

public abstract class EmpresaFinanciavel extends Empresa implements ClienteFinanciavel{

    public EmpresaFinanciavel(String razaoSocial, double totalFaturamento) {
        super(razaoSocial, totalFaturamento);
    }

    @Override
    public double calcularJuros(double valorSolicitado) {
        return TAXA_DE_JUROS;
    }
}
