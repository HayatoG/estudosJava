package Lista8;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("====CALCULADORA===");
        System.out.println("1 - Somar"+
                "\n2 - Subtrair"+
                "\n3 - Multiplicar"+
                "\n4 - Dividir");
        System.out.print("Digite o primeiro número: ");
        int num1 = leitor.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = leitor.nextInt();

        System.out.print("Digite a operação desejada: ");
        int opcao = leitor.nextInt();

        switch(opcao){
            case 1:
                System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
                break;
            case 2:
                System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
                break;
            case 3:
                System.out.println(num1 + " X " + num2 + " = " + (num1*num2));
                break;
            case 4:
                System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
                break;
        }

    }
}
