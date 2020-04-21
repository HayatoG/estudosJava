package Lista9;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("=== CÁLCULO DE TABUADA ===");
        int numero;

        do {
            System.out.print("Digite o número da tabuada (1-10): ");
            numero = leitor.nextInt();
        } while(numero < 1 || numero > 10);

        int contador = 1;

        while(contador <= 10) {
            int tabuada = contador * numero;
            System.out.println(contador + " x " + numero + " = " + tabuada);
            contador++;
        }
    }
}
