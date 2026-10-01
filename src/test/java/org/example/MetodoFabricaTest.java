package org.example;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

class MetodoFabricaTest {

    @Test
    void selecionaFabricaPJ() {
        FabricaAbstrata selecionada = MetodoFabrica.obterInstancia().selecionarFabrica("PJ");
        assertInstanceOf(FabricaPJ.class, selecionada);
    }

    @Test
    void selecionaFabricaPF() {
        FabricaAbstrata selecionada = MetodoFabrica.obterInstancia().selecionarFabrica("PF");
        assertInstanceOf(FabricaPF.class, selecionada);
    }

    @Test
    void lancaErroParaCategoriaDesconhecida() {
        IllegalArgumentException erro = assertThrows(IllegalArgumentException.class,
                () -> MetodoFabrica.obterInstancia().selecionarFabrica("PN"));
        assertEquals("Fábrica inexistente", erro.getMessage());
    }

    @Test
    void mantemUmaUnicaInstancia() {
        MetodoFabrica primeira = MetodoFabrica.obterInstancia();
        MetodoFabrica segunda = MetodoFabrica.obterInstancia();
        assertSame(primeira, segunda);
    }

    @Test
    void instanciaNaoEhNula() {
        assertNotNull(MetodoFabrica.obterInstancia());
    }

    @Test
    void construtorEhPrivado() throws NoSuchMethodException {
        Constructor<MetodoFabrica> construtor = MetodoFabrica.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(construtor.getModifiers()));
    }

}
