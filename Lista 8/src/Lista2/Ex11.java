package Lista2;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a base do terreno: ");
        double base = leitor.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = leitor.nextDouble();

        System.out.print("Digite o preço por metro: ");
        double preco = leitor.nextDouble();

        double area = base * altura;

        double totalPreco = area * preco;

        System.out.println("\nÁrea do terreno: " + area + "\nTotal do terreno: R$" + totalPreco);
    }
}
