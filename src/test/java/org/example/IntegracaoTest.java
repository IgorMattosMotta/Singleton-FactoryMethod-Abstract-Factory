package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegracaoTest {

    @Test
    void integraPadroesParaPessoaFisica() {
        AbstractFactory fabrica = FactoryMethod.obterInstancia().selecionarFabrica("PF");
        Cliente pessoaFisica = new Cliente(fabrica);
        assertEquals("Procuração Pessoa Física", pessoaFisica.obterProcuracao());
        assertEquals("Contrato Pessoa Física", pessoaFisica.obterContrato());
    }

    @Test
    void integraPadroesParaPessoaJuridica() {
        AbstractFactory fabrica = FactoryMethod.obterInstancia().selecionarFabrica("PJ");
        Cliente pessoaJuridica = new Cliente(fabrica);
        assertEquals("Procuração Pessoa Jurídica", pessoaJuridica.obterProcuracao());
        assertEquals("Contrato Pessoa Jurídica", pessoaJuridica.obterContrato());
    }

}
