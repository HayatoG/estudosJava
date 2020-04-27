package Lista2;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite sua idade em dias: ");
        int dias = leitor.nextInt();

        int anos = dias / 365;
        int meses = ((dias) - (anos * 365)) / 30;
        int dia = (((dias) - (anos * 365)) - (meses * 30));


        System.out.print("Você tem " + anos + " anos, " + meses + " meses, " + dia + " dias.");
    }
}
