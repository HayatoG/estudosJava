package Lista2;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota = leitor.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota1 = leitor.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota2 = leitor.nextDouble();

        double soma = (nota + nota1 + nota2)/3;

        System.out.printf("A nota final do aluno é: %.2f", soma);
    }
}
