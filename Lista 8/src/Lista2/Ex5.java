package Lista2;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        int lado = leitor.nextInt();

        int area = lado * lado;
        int perimetro = lado * 4;

        System.out.println("Área do quadrado: " + area +
                "\nPerímetro do quadrado: " + perimetro);
    }
}
