package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void geraProcuracaoPessoaFisica() {
        Cliente pessoaFisica = new Cliente(new FabricaPF());
        assertEquals("Procuração Pessoa Física", pessoaFisica.obterProcuracao());
    }

    @Test
    void geraContratoPessoaFisica() {
        Cliente pessoaFisica = new Cliente(new FabricaPF());
        assertEquals("Contrato Pessoa Física", pessoaFisica.obterContrato());
    }

    @Test
    void geraProcuracaoPessoaJuridica() {
        Cliente pessoaJuridica = new Cliente(new FabricaPJ());
        assertEquals("Procuração Pessoa Jurídica", pessoaJuridica.obterProcuracao());
    }

    @Test
    void geraContratoPessoaJuridica() {
        Cliente pessoaJuridica = new Cliente(new FabricaPJ());
        assertEquals("Contrato Pessoa Jurídica", pessoaJuridica.obterContrato());
    }

}
