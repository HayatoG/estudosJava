package Lista8;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int primeiro, segundo, terceiro;

        System.out.println("Digite um valor: ");
        int num1 = leitor.nextInt();

        System.out.println("Digite outro valor: ");
        int num2 = leitor.nextInt();

        System.out.println("Digite mais um valor (esse é o último, prometo): ");
        int num3 = leitor.nextInt();

        if(num1 > num2 || num1 > num3 || num2 > num1 || num2 > num3 || num3 > num1 || num3 > num2){
            if(num1 < num2 && num1 < num3){
                primeiro = num1;
                System.out.println(primeiro);
                if(num2 < num3){
                    segundo = num2;
                    terceiro = num3;
                    System.out.println(segundo);
                    System.out.println(terceiro);
                }else{
                    segundo = num3;
                    terceiro = num2;
                    System.out.println(segundo);
                    System.out.println(terceiro);
                }
            }else if(num2 < num1 && num2 < num3){
                primeiro = num2;
                System.out.println(primeiro);
                if(num1 < num3){
                    segundo = num1;
                    terceiro = num3;
                    System.out.println(segundo);
                    System.out.println(terceiro);
                }else{
                    segundo = num3;
                    terceiro = num1;
                    System.out.println(segundo);
                    System.out.println(terceiro);
                }
            }else if(num3 < num1 && num3 < num2){
                primeiro = num3;
                System.out.println(primeiro);
                if(num1 < num2){
                    segundo = num1;
                    terceiro = num2;
                    System.out.println(segundo);
                    System.out.println(terceiro);
                }else{
                    segundo = num2;
                    terceiro = num1;
                    System.out.println(segundo);
                    System.out.println(terceiro);
                }
            }
        }
    }
}
