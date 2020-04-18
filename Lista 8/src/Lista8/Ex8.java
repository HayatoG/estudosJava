package Lista8;
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número entre 0 e 11: ");
        int num = leitor.nextInt();

        switch(num){
            case 0:
                System.out.println("Janeiro");
            case 1:
                System.out.println("Fevereiro");
            case 2:
                System.out.println("Março");
            case 3:
                System.out.println("Abril");
            case 4:
                System.out.println("Maio");
            case 5:
                System.out.println("Junho");
            case 6:
                System.out.println("Julho");
            case 7:
                System.out.println("Agosto");
            case 8:
                System.out.println("Setembro");
            case 9:
                System.out.println("Outubro");
            case 10:
                System.out.println("Novembro");
            case 11:
                System.out.println("Dezembro");
        }
        System.out.println("Quando vai acabar essa quarentena meudeus?");
    }
}
