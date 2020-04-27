package Lista2;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o evento em segundos: ");
        int segundo = leitor.nextInt();

        int horas = segundo / 3600;
        int minutos = segundo / 60;
        int segundos = segundo - (minutos * 60);

        System.out.print("São " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos.");
    }
}
