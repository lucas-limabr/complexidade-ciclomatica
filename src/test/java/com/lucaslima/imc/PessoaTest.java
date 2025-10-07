package com.lucaslima.imc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa p1;
    Pessoa p2;

    @BeforeEach
    void setUp() {
        p1 = new Pessoa();
        p2 = new Pessoa();
    }

    @Test
    void deveRetornarHomemAbaixodoPeso()
    {
        p1.setPeso(20.6);
        p1.setAltura(1);
        p1.setSexo("masculino");
        assertEquals("Abaixo do peso", p1.calcularIMC());
    }

    @Test
    void deveRetornarHomemPesoNormal()
    {
        p1.setPeso(26.3);
        p1.setAltura(1);
        p1.setSexo("masculino");
        assertEquals("No peso normal", p1.calcularIMC());
    }

    @Test
    void deveRetornarHomemMarginalmenteAcimaPeso()
    {
        p1.setPeso(27.7);
        p1.setAltura(1);
        p1.setSexo("masculino");
        assertEquals("Marginalmente acima do peso", p1.calcularIMC());
    }

    @Test
    void deveRetornarHomemMAcimaPesoIdeal()
    {
        p1.setPeso(31.0);
        p1.setAltura(1);
        p1.setSexo("masculino");
        assertEquals("Acima do peso ideal", p1.calcularIMC());
    }

    @Test
    void deveRetornarHomemObeso()
    {
        p1.setPeso(31.1);
        p1.setAltura(1);
        p1.setSexo("masculino");
        assertEquals("Obeso", p1.calcularIMC());
    }

    @Test
    void deveRetornarMulherAbaixodoPeso()
    {
        p2.setPeso(19.0);
        p2.setAltura(1);
        p2.setSexo("feminino");
        assertEquals("Abaixo do peso", p2.calcularIMC());
    }

    @Test
    void deveRetornarMulherPesoNormal()
    {
        p2.setPeso(25.7);
        p2.setAltura(1);
        p2.setSexo("feminino");
        assertEquals("No peso normal", p2.calcularIMC());
    }

    @Test
    void deveRetornarMulherMarginalmenteAcimaPeso()
    {
        p2.setPeso(27.2);
        p2.setAltura(1);
        p2.setSexo("feminino");
        assertEquals("Marginalmente acima do peso", p2.calcularIMC());
    }

    @Test
    void deveRetornarMulherMAcimaPesoIdeal()
    {
        p2.setPeso(32.2);
        p2.setAltura(1);
        p2.setSexo("feminino");
        assertEquals("Acima do peso ideal", p2.calcularIMC());
    }

    @Test
    void deveRetornarMulherObesa()
    {
        p2.setPeso(32.3);
        p2.setAltura(1);
        p2.setSexo("feminino");
        assertEquals("Obesa", p2.calcularIMC());
    }
}