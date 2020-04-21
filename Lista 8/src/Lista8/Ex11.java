package Lista8;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = leitor.nextLine();

        System.out.print("A ultima letra da palavra ''"+ palavra + "'' é: " + palavra.substring(palavra.length()-1));

    }
}
