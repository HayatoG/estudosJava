package Lista8;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double result;

        System.out.print("Digite o primeiro valor: ");
        double valor1 = leitor.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = leitor.nextDouble();

        if(valor1 == 0 || valor2 == 0){
            System.out.println("Valor inválido.");
        }
        else if(valor1 > 0 && valor2 > 0){
            result = valor1 + valor2;
            System.out.println("Valores positivos, somando...");
            System.out.println("Resultado da soma: "+result);
        }
        else if(valor1 < 0 && valor2 < 0){
            result = valor1 - valor2;
            System.out.println("Valores negativos, subtraindo...");
            System.out.println("Resultado da subtração: "+result);
        }
        else{
            result = valor1 * valor2;
            System.out.println("Um dos valores é negativo, multiplicando...");
            System.out.println("Resultado da multiplicação: "+result);
        }


    }
}
