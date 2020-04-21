package Lista9;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma palavra ou frase: ");
        String frase = leitor.nextLine();

        for(int i = 0; i < frase.length(); i++) {
            char newFrase = frase.charAt(i);
            System.out.print(" - " + newFrase);
        }
    }
}
