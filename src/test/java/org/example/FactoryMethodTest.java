package org.example;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {

    @Test
    void selecionaFabricaPJ() {
        AbstractFactory selecionada = FactoryMethod.obterInstancia().selecionarFabrica("PJ");
        assertInstanceOf(FabricaPJ.class, selecionada);
    }

    @Test
    void selecionaFabricaPF() {
        AbstractFactory selecionada = FactoryMethod.obterInstancia().selecionarFabrica("PF");
        assertInstanceOf(FabricaPF.class, selecionada);
    }

    @Test
    void lancaErroParaCategoriaDesconhecida() {
        IllegalArgumentException erro = assertThrows(IllegalArgumentException.class,
                () -> FactoryMethod.obterInstancia().selecionarFabrica("PN"));
        assertEquals("Fábrica inexistente", erro.getMessage());
    }

    @Test
    void mantemUmaUnicaInstancia() {
        FactoryMethod primeira = FactoryMethod.obterInstancia();
        FactoryMethod segunda = FactoryMethod.obterInstancia();
        assertSame(primeira, segunda);
    }

    @Test
    void instanciaNaoEhNula() {
        assertNotNull(FactoryMethod.obterInstancia());
    }

    @Test
    void construtorEhPrivado() throws NoSuchMethodException {
        Constructor<FactoryMethod> construtor = FactoryMethod.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(construtor.getModifiers()));
    }

}
