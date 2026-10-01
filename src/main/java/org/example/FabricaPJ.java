package org.example;

public class FabricaPJ implements AbstractFactory {

    @Override
    public Procuracao gerarProcuracao() {
        return new ProcuracaoPJ();
    }

    @Override
    public Contrato gerarContrato() {
        return new ContratoPJ();
    }
}
