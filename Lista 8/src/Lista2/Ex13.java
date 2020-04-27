package Lista2;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a base do triângulo: ");
        int base = leitor.nextInt();

        System.out.print("Digite a altura do triângulo: ");
        int altura = leitor.nextInt();

        int area = (base * altura)/2;

        System.out.print("Área do triângulo: " + area + "cm²");
    }
}
