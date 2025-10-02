//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final double PESO = 64.0;
        final double ALTURA = 1.74;
        final String SEXO = "masculino";
        String classificacaoIMC;

        Pessoa p1 = new Pessoa(PESO, ALTURA, SEXO);
        System.out.println(p1.calcularIMC());
    }
}