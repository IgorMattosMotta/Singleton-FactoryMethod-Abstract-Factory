package org.example;

public class FactoryMethod {

    private static final FactoryMethod UNICA = new FactoryMethod();

    public static FactoryMethod obterInstancia() {
        return UNICA;
    }

    public AbstractFactory selecionarFabrica(String categoria) {
        if ("PJ".equalsIgnoreCase(categoria)) {
            return new FabricaPJ();
        }
        if ("PF".equalsIgnoreCase(categoria)) {
            return new FabricaPF();
        }
        throw new IllegalArgumentException("Fábrica inexistente");
    }

    private FactoryMethod() {
    }
}
