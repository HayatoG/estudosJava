package Lista8;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("===MENU==="+
                "\n1 - Cadastro"+
                "\n2 - Consulta"+
                "\n3 - Sair"+
                "\nEscolha uma opção:");
        int opcao = leitor.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Você está no cadastro.");
                break;
            case 2:
                System.out.println("Você está na consulta.");
                break;
            case 3:
                System.out.println("Saindo...");
                break;
        }
    }
}
