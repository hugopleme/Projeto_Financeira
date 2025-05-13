package com.algaworks;

import com.algaworks.servico.ServicoPagamentoBonus;
import com.algaworks.tipo.Funcionario;
import com.algaworks.tipo.PessoaBonificavel;

public class Main2 {

    public static void main(String[] args) {
        PessoaBonificavel pessoa = new Funcionario("Hugo", 50_000);
        ServicoPagamentoBonus servicoPagamentoBonus = new ServicoPagamentoBonus();

        servicoPagamentoBonus.pagar(pessoa, 80.4);
    }
}
