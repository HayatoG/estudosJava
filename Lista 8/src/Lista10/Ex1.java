package Lista10;
import java.util.Scanner;
import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random random = new Random();

        int tentativas = 0, aleatorio = random.nextInt(10), numero = 0;

        System.out.print("Vamos começar, digite um número entre 1 e 10: ");
        numero = leitor.nextInt();

        while(numero != aleatorio){
            if (numero < aleatorio){
                System.out.print("Tente um número maior, amigo");
                tentativas++;
                System.out.print("\nNovamente, digite um número entre 1 e 10: ");
                numero = leitor.nextInt();
            }
            else{
                System.out.print("Digite um número menor, amigo");
                tentativas++;
                System.out.print("\nNovamente, digite um número entre 1 e 10: ");
                numero = leitor.nextInt();
            }
        }
        if(numero == aleatorio){
            System.out.print("Parabéééééns!! Você acertou, o número em " + tentativas + " tentativas.");
        }
    }
}
