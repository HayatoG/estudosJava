package Lista10;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int inteiro = 0;
        int menor = inteiro;

        System.out.printf("Digite um número inteiro: ");
        menor = leitor.nextInt();

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite um número inteiro: ");
            inteiro = leitor.nextInt();
            if (inteiro < menor){
                menor = inteiro;
            }
        }
        System.out.println("O menor número é: " + menor);
    }
}
