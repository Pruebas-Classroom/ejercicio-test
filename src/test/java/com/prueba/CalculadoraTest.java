package com.prueba;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSumar() {
        assertEquals(5, calculadora.sumar(2, 3), "La suma de 2 y 3 debería ser 5");
        assertEquals(-1, calculadora.sumar(-2, 1), "La suma de -2 y 1 debería ser -1");
    }

    @Test
    public void testRestar() {
        assertEquals(1, calculadora.restar(3, 2), "La resta de 3 y 2 debería ser 1");
        assertEquals(-3, calculadora.restar(-2, 1), "La resta de -2 y 1 debería ser -3");
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3), "La multiplicación de 2 y 3 debería ser 6");
        assertEquals(-2, calculadora.multiplicar(-1, 2), "La multiplicación de -1 y 2 debería ser -2");
    }

    @Test
    public void testDividir() {
        assertEquals(2, calculadora.dividir(4, 2), "La división de 4 y 2 debería ser 2");
        assertEquals(0, calculadora.dividir(0, 2), "La división de 0 por 2 debería ser 0");

        // Prueba de excepción al dividir por cero
        assertThrows(ArithmeticException.class, () -> {
            calculadora.dividir(4, 0);
        }, "Dividir por cero debería lanzar ArithmeticException");
    }
}