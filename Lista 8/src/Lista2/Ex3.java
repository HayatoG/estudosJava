package Lista2;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o 1º número: ");
        int num1 = leitor.nextInt();

        System.out.println("Digite o 2º número: ");
        int num2 = leitor.nextInt();

        System.out.println("Digite o 3º número: ");
        int num3 = leitor.nextInt();

        System.out.println("Resultado do produto entre estes três números: " + (num1 * num2 * num3));
    }
}
