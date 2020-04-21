package Lista8;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = leitor.nextLine();

        System.out.println("Palavra em letras maiúsculas: " + palavra.toUpperCase());
        System.out.println("Palavra em letras minúsculas: " + palavra.toLowerCase());
    }
}
