package Lista2;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite seu estado civil: ");
        String estadoCivil = leitor.nextLine();

        System.out.println("Digite seu endereço: ");
        String endereco = leitor.nextLine();

        System.out.println("Digite seu Telefone: ");
        String telefone = leitor.nextLine();

        System.out.println("====FICHA DO CLIENTE====");
        System.out.println("Nome: " + nome +
                "\nEstado Civil: " + estadoCivil +
                "\nEndereço: " + endereco +
                "\nTelefone: " + telefone);
        System.out.println("========================");
    }
}
