package Lista2;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num1 = leitor.nextInt();

        System.out.println("Digite outro numero: ");
        int num2 = leitor.nextInt();

        double result = num1/num2;
        double resto = num1%num2;

        System.out.print("Quociente: " + result + "\nResto: " + resto);
    }
}
