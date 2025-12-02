package com.lucaslima.imc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class PessoaTest {

    Pessoa pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Pessoa();
    }

    @Test
    void deveRetornarHomemAbaixodoPeso()
    {
        pessoa.setPeso(20.6);
        pessoa.setAltura(1);
        pessoa.setSexo("masculino");
        assertEquals("Abaixo do peso", pessoa.calcularIMC(pessoa));
    }

    @Test
    void deveRetornarHomemPesoNormal()
    {
        pessoa.setPeso(26.3);
        pessoa.setAltura(1);
        pessoa.setSexo("masculino");
        assertEquals("No peso normal", pessoa.calcularIMC(pessoa));
    }

    @Test
    void deveRetornarHomemMarginalmenteAcimaPeso()
    {
        pessoa.setPeso(27.7);
        pessoa.setAltura(1);
        pessoa.setSexo("masculino");
        assertEquals("Marginalmente acima do peso", pessoa.calcularIMC(pessoa));
    }

    @Test
    void deveRetornarHomemMAcimaPesoIdeal()
    {
        pessoa.setPeso(31.0);
        pessoa.setAltura(1);
        pessoa.setSexo("masculino");
        assertEquals("Acima do peso ideal", pessoa.calcularIMC(pessoa));
    }

    @Test
    void deveRetornarHomemObeso()
    {
        pessoa.setPeso(31.1);
        pessoa.setAltura(1);
        pessoa.setSexo("masculino");
        assertEquals("Obeso", pessoa.calcularIMC(pessoa));
    }

    @Test
    void deveRetornarMulherAbaixodoPeso()
    {
        pessoa.setPeso(19.0);
        pessoa.setAltura(1);
        pessoa.setSexo("feminino");
        assertEquals("Abaixo do peso", pessoa.calcularIMC(pessoa));
    }

    @Test
    void deveRetornarMulherPesoNormal()
    {
        pessoa.setPeso(25.7);
        pessoa.setAltura(1);
        pessoa.setSexo("feminino");
        assertEquals("No peso normal", pessoa.calcularIMC(pessoa));
    }

    @Test
    void deveRetornarMulherMarginalmenteAcimaPeso()
    {
        pessoa.setPeso(27.2);
        pessoa.setAltura(1);
        pessoa.setSexo("feminino");
        assertEquals("Marginalmente acima do peso", pessoa.calcularIMC(pessoa));
    }

    @Test
    void deveRetornarMulherMAcimaPesoIdeal()
    {
        pessoa.setPeso(32.2);
        pessoa.setAltura(1);
        pessoa.setSexo("feminino");
        assertEquals("Acima do peso ideal", pessoa.calcularIMC(pessoa));
    }

    @Test
    void deveRetornarMulherObesa()
    {
        pessoa.setPeso(32.3);
        pessoa.setAltura(1);
        pessoa.setSexo("feminino");
        assertEquals("Obesa", pessoa.calcularIMC(pessoa));
    }

    //Mocks
    @Test
    void deveRetornarHomemAbaixodoPesoMock()
    {
        PessoaInfo info = mock(PessoaInfo.class);
        when(info.getPeso()).thenReturn(20.6);
        when(info.getAltura()).thenReturn(1.0);
        when(info.getSexo()).thenReturn("masculino");

        String resultado = this.pessoa.calcularIMC(info);
        assertEquals("Abaixo do peso", resultado);
    }

    @Test
    void deveRetornarHomemPesoNormalMock()
    {
        PessoaInfo info = mock(PessoaInfo.class);
        when(info.getPeso()).thenReturn(26.3);
        when(info.getAltura()).thenReturn(1.0);
        when(info.getSexo()).thenReturn("masculino");

        String resultado = this.pessoa.calcularIMC(info);
        assertEquals("No peso normal", resultado);
    }

    @Test
    void deveRetornarHomemMarginalmenteAcimaPesoMock()
    {
        PessoaInfo info = mock(PessoaInfo.class);
        when(info.getPeso()).thenReturn(27.7);
        when(info.getAltura()).thenReturn(1.0);
        when(info.getSexo()).thenReturn("masculino");
        assertEquals("Marginalmente acima do peso", pessoa.calcularIMC(info));
    }

    @Test
    void deveRetornarHomemMAcimaPesoIdealMock()
    {
        PessoaInfo info = mock(PessoaInfo.class);
        when(info.getPeso()).thenReturn(31.0);
        when(info.getAltura()).thenReturn(1.0);
        when(info.getSexo()).thenReturn("masculino");
        assertEquals("Acima do peso ideal", pessoa.calcularIMC(info));
    }

    @Test
    void deveRetornarHomemObesoMock()
    {
        PessoaInfo info = mock(PessoaInfo.class);
        when(info.getPeso()).thenReturn(31.1);
        when(info.getAltura()).thenReturn(1.0);
        when(info.getSexo()).thenReturn("masculino");
        assertEquals("Obeso", pessoa.calcularIMC(info));
    }

    @Test
    void deveRetornarMulherAbaixodoPesoMock()
    {
        PessoaInfo info = mock(PessoaInfo.class);
        when(info.getPeso()).thenReturn(19.0);
        when(info.getAltura()).thenReturn(1.0);
        when(info.getSexo()).thenReturn("feminino");
        assertEquals("Abaixo do peso", pessoa.calcularIMC(info));
    }

    @Test
    void deveRetornarMulherPesoNormalMock()
    {
        PessoaInfo info = mock(PessoaInfo.class);
        when(info.getPeso()).thenReturn(25.7);
        when(info.getAltura()).thenReturn(1.0);
        when(info.getSexo()).thenReturn("feminino");
        assertEquals("No peso normal", pessoa.calcularIMC(info));
    }

    @Test
    void deveRetornarMulherMarginalmenteAcimaPesoMock()
    {
        PessoaInfo info = mock(PessoaInfo.class);
        when(info.getPeso()).thenReturn(27.2);
        when(info.getAltura()).thenReturn(1.0);
        when(info.getSexo()).thenReturn("feminino");
        assertEquals("Marginalmente acima do peso", pessoa.calcularIMC(info));
    }

    @Test
    void deveRetornarMulherMAcimaPesoIdealMock()
    {
        PessoaInfo info = mock(PessoaInfo.class);
        when(info.getPeso()).thenReturn(32.2);
        when(info.getAltura()).thenReturn(1.0);
        when(info.getSexo()).thenReturn("feminino");
        assertEquals("Acima do peso ideal", pessoa.calcularIMC(info));
    }

    @Test
    void deveRetornarMulherObesaMock()
    {
        PessoaInfo info = mock(PessoaInfo.class);
        when(info.getPeso()).thenReturn(32.3);
        when(info.getAltura()).thenReturn(1.0);
        when(info.getSexo()).thenReturn("feminino");

        String resultado = this.pessoa.calcularIMC(info);
        assertEquals("Obesa", resultado);
    }
}