package Lista8;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = leitor.nextLine();

        System.out.print("A primeira letra da palavra ''"+ palavra + "'' é: " + palavra.substring(0,1));
    }
}
