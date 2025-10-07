package com.lucaslima.imc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ImcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImcApplication.class, args);

        final double PESO = 64.0;
        final double ALTURA = 1.74;
        final String SEXO = "masculino";
        String classificacaoIMC;

        Pessoa p1 = new Pessoa(PESO, ALTURA, SEXO);
        System.out.println(p1.calcularIMC());
	}

}
