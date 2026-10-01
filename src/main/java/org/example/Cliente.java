package org.example;

public class Cliente {

    private final Procuracao minhaProcuracao;
    private final Contrato meuContrato;

    public Cliente(FabricaAbstrata fabricaEscolhida) {
        this.minhaProcuracao = fabricaEscolhida.gerarProcuracao();
        this.meuContrato = fabricaEscolhida.gerarContrato();
    }

    public String obterProcuracao() {
        return minhaProcuracao.descrever();
    }

    public String obterContrato() {
        return meuContrato.descrever();
    }
}
