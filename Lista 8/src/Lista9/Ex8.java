package Lista9;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = leitor.nextInt();
        int reserva = num;
        for (int i = 1; num >= i; num--){
            if(reserva%num==0){
                System.out.println("12 é divisivel por " + num);
            }
        }
    }
}
