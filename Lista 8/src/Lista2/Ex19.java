package Lista2;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = leitor.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = leitor.nextInt();

        int resultA = ((num1/num2)*100);
        int resultB = ((num1*100)/num2);

        System.out.println("Resultado A: " + resultA);
        System.out.println("Resultado B: " + resultB);
    }
}
