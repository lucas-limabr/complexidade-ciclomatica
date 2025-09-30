public class IMC {

    private Double imc;
    private Pessoa pessoa;
    private String classificacaoImc;

    public String calcularIMC(Pessoa pessoa)
    {
        imc = pessoa.getPeso() / (pessoa.getAltura() * pessoa.getAltura());

        if((pessoa.getSexo().equalsIgnoreCase("feminino") && imc < 19.1) || (pessoa.getSexo().equalsIgnoreCase("masculino") && imc < 20.7))
        {
            this.classificacaoImc = "Abaixo do peso";
        }
        else if((pessoa.getSexo().equalsIgnoreCase("feminino") && imc < 25.8) || (pessoa.getSexo().equalsIgnoreCase("masculino") && imc < 26.4))
        {
            this.classificacaoImc = "No peso normal";
        }
        else if((pessoa.getSexo().equalsIgnoreCase("feminino") && imc < 27.3) || (pessoa.getSexo().equalsIgnoreCase("masculino") && imc < 27.8))
        {
            this.classificacaoImc = "Marginalmente acima do peso";
        }
        else if((pessoa.getSexo().equalsIgnoreCase("feminino") && imc < 32.3) || (pessoa.getSexo().equalsIgnoreCase("masculino") && imc < 31.1))
        {
            this.classificacaoImc = "Acima do peso ideal";
        }
        else if(pessoa.getSexo().equalsIgnoreCase("masculino") || pessoa.getSexo().equalsIgnoreCase("feminino")) {
            this.classificacaoImc = "Obeso";
        }
        return classificacaoImc;
    }
}
