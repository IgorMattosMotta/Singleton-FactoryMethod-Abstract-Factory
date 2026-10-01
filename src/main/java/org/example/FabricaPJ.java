package org.example;

public class FabricaPJ implements FabricaAbstrata {

    @Override
    public Procuracao gerarProcuracao() {
        return new ProcuracaoPJ();
    }

    @Override
    public Contrato gerarContrato() {
        return new ContratoPJ();
    }
}
