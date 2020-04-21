package Lista8;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = leitor.nextLine();

        System.out.print("Digite uma palavra dessa frase: ");
        String palavra = leitor.next();

        System.out.print("Digite a palavra para substituir: ");
        String substituta = leitor.next();

        String novaFrase = frase.replace(palavra, substituta);

        System.out.print("Nova frase: " + novaFrase);
    }
}
