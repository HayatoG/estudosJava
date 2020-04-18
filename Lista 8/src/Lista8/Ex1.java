package Lista8;
import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        boolean num1 = leitor.nextBoolean();

        leitor.next();

        System.out.print("Digite outro valor: ");
        boolean num2 = leitor.nextBoolean();

        if(num1 != num2){
            System.out.println("Os números não são iguais.");
        }
        else{
            System.out.println("Os números são iguais.");
        }

    }
}
