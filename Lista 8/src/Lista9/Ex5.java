package Lista9;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner leitor  = new Scanner(System.in);

        int i = 1;
        int num = 0;
        do{
            System.out.print("Digite um número: ");
            num = leitor.nextInt();

            if(num%2==0){
                System.out.println("É par.");
            }
            else{
                System.out.println("É ímpar.");
            }
            i++;
        }while (i <= 5);
    }
}
