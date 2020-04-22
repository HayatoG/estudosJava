package Lista2;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = leitor.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = leitor.nextDouble();

        System.out.print("Resultado do primeiro número: " + Math.pow(num1,3) +
                "\nResultado do segundo número: " + Math.pow(num2,3));
    }
}
