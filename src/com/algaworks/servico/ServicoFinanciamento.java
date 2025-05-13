package com.algaworks.servico;

import com.algaworks.tipo.ClienteFinanciavel;

public class ServicoFinanciamento {

    public void solicitarFinanciamento(ClienteFinanciavel cliente, double valorSolicitadoFinanciamento){

        double limiteAprovado = cliente.calcularLimiteAprovado();
        double jurosCalculado = cliente.calcularJuros(valorSolicitadoFinanciamento);

        if (valorSolicitadoFinanciamento > limiteAprovado) {
            System.out.printf("Financiamento não aprovado para o cliente%n" +
                            "Valor solicitado: R$%.2f%nJuros: %.2f%%%nLimite Máximo: R$ %.2f%n%n",
                    valorSolicitadoFinanciamento, jurosCalculado, limiteAprovado);
        }else{
            System.out.printf("Financiamento aprovado para o cliente%n" +
                            "Valor solicitado: R$%.2f%nJuros: %.2f%%%nLimite Máximo: R$ %.2f%n%n",
                    valorSolicitadoFinanciamento, jurosCalculado, limiteAprovado);
        }
    }
}
