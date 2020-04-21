package Lista8;
import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = leitor.nextLine();

        System.out.print("Digite uma palavra contida na frase: ");
        String palavra = leitor.next();

        int pos = frase.indexOf(palavra);

        if(pos == -1){
            System.out.println("Essa palavra não está na frase.");
        }
        else{
            System.out.println("Posição da palavra: " + pos);
        }

    }
}
