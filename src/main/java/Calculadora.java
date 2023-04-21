import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] asgs) {

        Scanner leitor = new Scanner(System.in);

        Double valorUm;
        Double valorDois;
        String operacao;
        boolean continua;

        try {
            do {
                System.out.println("Digite o primeiro valor: ");
                valorUm = leitor.nextDouble();

                System.out.println("Qual operação de seja: ");
                System.out.println("[ + | - | * | / ]");
                operacao = leitor.next();

                System.out.println("Digite o segunndo valor: ");
                valorDois = leitor.nextDouble();

                System.out.println("Resultado = " + realizarOperacao(valorUm, valorDois, operacao));

                continua = verificar();
            } while (continua);
        } catch (InputMismatchException exception){
            System.out.println("Os valores para o cálculo devem ser numéricos.");
        }

    }

    public static boolean verificar(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Deseja realizar outro cálculo? [S/N]");
        return !leitor.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }
    public static Double realizarOperacao(Double valorUm, Double valorDois, String operacao) {

        Double resultado = 0.0;

        switch (operacao){
            case "+":
                resultado = valorUm + valorDois;
                break;
            case "-":
                resultado = valorUm - valorDois;
                break;
            case "*":
                resultado = valorUm * valorDois;
                break;
            case "/":
                resultado = valorUm / valorDois;
                break;
            default:
                System.out.println("Operação Inválida, tente novamente.");
        }
        return resultado;
    }

}
