package com.lucaslima.imc;

public class Pessoa implements PessoaInfo {

    private double peso;
    private double altura;
    private String sexo;

    public Pessoa(double peso, double altura, String sexo) {
        this.setSexo(sexo);
        this.setAltura(altura);
        this.setPeso(peso);
    }

    public Pessoa() {
    }

    public String calcularIMC(PessoaInfo info) {
        double imc = info.getPeso() / (info.getAltura() * info.getAltura());
        String classificacaoImc;

        if (info.getSexo().equalsIgnoreCase("feminino")) {
            if (imc < 19.1) {
                classificacaoImc = "Abaixo do peso";
            } else if (imc < 25.8) {
                classificacaoImc = "No peso normal";
            } else if (imc < 27.3) {
                classificacaoImc = "Marginalmente acima do peso";
            } else if (imc < 32.3) {
                classificacaoImc = "Acima do peso ideal";
            } else {
                classificacaoImc = "Obesa";
            }
        } else {
            if (imc < 20.7) {
                classificacaoImc = "Abaixo do peso";
            } else if (imc < 26.4) {
                classificacaoImc = "No peso normal";
            } else if (imc < 27.8) {
                classificacaoImc = "Marginalmente acima do peso";
            } else if (imc < 31.1) {
                classificacaoImc = "Acima do peso ideal";
            } else {
                classificacaoImc = "Obeso";
            }
        }
        return classificacaoImc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if(!sexo.equalsIgnoreCase("masculino") && !sexo.equalsIgnoreCase("feminino"))
        {
            throw new IllegalArgumentException("gênero inválido");
        }
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso <= 0)
        {
            throw new IllegalArgumentException("peso inválido");
        }
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura <= 0)
        {
            throw new IllegalArgumentException("altura inválida");
        }
        this.altura = altura;
    }
}
