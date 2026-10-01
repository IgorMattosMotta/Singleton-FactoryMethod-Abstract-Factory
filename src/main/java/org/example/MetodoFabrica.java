package org.example;

public class MetodoFabrica {

    private static final MetodoFabrica UNICA = new MetodoFabrica();

    public static MetodoFabrica obterInstancia() {
        return UNICA;
    }

    public FabricaAbstrata selecionarFabrica(String categoria) {
        if ("PJ".equalsIgnoreCase(categoria)) {
            return new FabricaPJ();
        }
        if ("PF".equalsIgnoreCase(categoria)) {
            return new FabricaPF();
        }
        throw new IllegalArgumentException("Fábrica inexistente");
    }

    private MetodoFabrica() {
    }
}
