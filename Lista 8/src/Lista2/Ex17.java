package Lista2;
import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a distância em metros: ");
        double distancia = leitor.nextDouble();

        double kilometros = (distancia * 225)/1000;

        System.out.printf("Distância percorrida em quilômetros: %.2f", kilometros);
    }
}
