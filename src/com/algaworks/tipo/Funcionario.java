package com.algaworks.tipo;

public class Funcionario implements PessoaBonificavel{

    public static final int QUANTIDADE_DE_SALARIOS_PARA_LIMITE = 5;
    double salarioMensal;
    String nome;

    public Funcionario( String nome, double salarioMensal) {
        this.salarioMensal = salarioMensal;
        this.nome = nome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public double calcularLimiteAprovado() {
        return getSalarioMensal() * QUANTIDADE_DE_SALARIOS_PARA_LIMITE;
    }

    @Override
    public double calcularBonus(double metaPercentualAlcancada) {
        return getSalarioMensal() * metaPercentualAlcancada / 100;
    }
}
