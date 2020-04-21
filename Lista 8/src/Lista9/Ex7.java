package Lista9;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int cont = 1;
        int soma = 0;

        while(cont <= 10) {
            System.out.print("Digite o " + cont + " número: ");
            soma += leitor.nextInt();
            cont++;
        }

        System.out.println("Valor das somas é: " + soma);
    }
}