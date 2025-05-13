package com.algaworks;

import com.algaworks.servico.ServicoFinanciamento;
import com.algaworks.tipo.Fazenda;
import com.algaworks.tipo.Funcionario;
import com.algaworks.tipo.Industria;
import com.algaworks.tipo.Varejista;

public class Main {
    public static void main(String[] args) {

        var fazenda = new Fazenda("Dunder Muffin", 1_000_000, 10);
        var industria = new Industria("AMD", 5_000_000, true);
        var varejo = new Varejista("Mercadinho do Tonhão", 600_000, 150_000);
        var funcionario = new Funcionario("Hugo", 5_000);
        var servicoFinanciamento = new ServicoFinanciamento();

        servicoFinanciamento.solicitarFinanciamento(fazenda, 700_000);
        servicoFinanciamento.solicitarFinanciamento(industria, 1_500_000);
        servicoFinanciamento.solicitarFinanciamento(varejo, 200_000);
        servicoFinanciamento.solicitarFinanciamento(funcionario, 20_000);
    }
}
