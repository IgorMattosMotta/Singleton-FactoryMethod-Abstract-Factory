package org.example;

public class FabricaPF implements AbstractFactory {

    @Override
    public Procuracao gerarProcuracao() {
        return new ProcuracaoPF();
    }

    @Override
    public Contrato gerarContrato() {
        return new ContratoPF();
    }
}
