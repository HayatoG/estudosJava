package Lista2;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a marca do celular: ");
        String marca = leitor.nextLine();

        System.out.print("Digite o modelo do celular: ");
        String modelo = leitor.next();

        System.out.print("Digite o preço de fábrica do celular: ");
        double preco = leitor.nextDouble();

        double totalPreco = preco + (preco * 0.28) + (preco * 0.20);

        System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nPreço final: " + totalPreco);
    }
}
