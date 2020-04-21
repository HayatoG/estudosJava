package Lista8;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = leitor.nextLine();

        String primeira = palavra.substring(0,1);
        String alterada = primeira.toUpperCase();
        String substituida = palavra.replaceFirst(palavra.substring(0,1),alterada);

        System.out.print("Palavra substituida: " + substituida);
    }
}