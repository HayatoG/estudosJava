package Lista2;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Quantos anos você tem? ");
        int anos = leitor.nextInt();

        System.out.print("Meses: ");
        int meses = leitor.nextInt();

        System.out.print("Dias: ");
        int dias = leitor.nextInt();

        int total = (anos * 365) + (meses * 30) + dias;

        System.out.print("Você já viveu " + total + " dias.");
    }
}
