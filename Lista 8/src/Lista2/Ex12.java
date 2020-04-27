package Lista2;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o preço do litro: ");
        double litro = leitor.nextDouble();

        System.out.print("Digite quanto irá pagar: ");
        double dinheiro = leitor.nextDouble();

        double total = dinheiro / litro;

        System.out.printf("Qtd de litros: %.2f", total);
    }
}
