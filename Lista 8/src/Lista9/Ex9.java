package Lista9;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String palavra;
        do{
            System.out.print("Digite uma palavra de 6 caracteres: ");
            palavra = leitor.nextLine();

        }while(palavra.length() != 6);
        System.out.println("Palavra inserida corretamente, Obrigado!");
    }
}
