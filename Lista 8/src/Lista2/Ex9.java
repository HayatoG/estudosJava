package Lista2;
import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a nota da prova 1: ");
        double prova1 = leitor.nextDouble();

        System.out.print("Digite a nota da prova 2: ");
        double prova2 = leitor.nextDouble();

        System.out.print("Digite a nota da prova 3: ");
        double prova3 = leitor.nextDouble();

        double media = ((prova1 * 0.2) + (prova2 * 0.3) + (prova3 * 0.5));

        System.out.print("Nota final: " + media);
    }
}
