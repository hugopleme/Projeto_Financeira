package com.algaworks.servico;

import com.algaworks.tipo.Funcionario;
import com.algaworks.tipo.PessoaBonificavel;

public class ServicoPagamentoBonus {

     public void pagar(PessoaBonificavel pessoa, double percentualMetaAlcancada){
        double valorBonus = pessoa.calcularBonus(percentualMetaAlcancada);

        System.out.printf("Valor do bônus: R$%.2f", valorBonus);
    }
}
