//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final Double PESO = 64.0;
        final Double ALTURA = 1.74;
        final String SEXO = "masculino";
        String classificacaoIMC;

        Pessoa p1 = new Pessoa(PESO, ALTURA, SEXO);
        IMC imc = new IMC();
        classificacaoIMC = imc.calcularIMC(p1);

        System.out.println(classificacaoIMC);
    }
}