package Lista2;
import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade = 0;
        int peso = 0;
        int resultPeso1 = 0;
        int idade1 = 0;
        int resultPeso2 = 0;
        int idade2 = 0;
        int resultPeso3 = 0;
        int idade3 = 0;
        int resultPeso4 = 0;
        int idade4 = 0;

        for (int i = 0; i <= 15; i++) {
            System.out.print("Digite sua idade: ");
            idade = leitor.nextInt();

            System.out.print("Digite seu peso: ");
            peso = leitor.nextInt();

            if (idade >= 1 && idade <= 10) {
                resultPeso1 = peso + resultPeso1;
                idade1++;
            }
            else if (idade >= 11 && idade <= 20) {
                resultPeso2 = peso + resultPeso2;
                idade2++;
            }
            else if (idade >= 21 && idade <= 30) {
                resultPeso3 = peso + resultPeso3;
                idade3++;
            }
            else if (idade > 30) {
                resultPeso4 = peso + resultPeso4;
                idade4++;
            }
        }
        System.out.println("Média de peso 1 a 10: " + resultPeso1/idade1);
        System.out.println("Média de peso 11 a 20: " + resultPeso2/idade2);
        System.out.println("Média de peso 21 a 30: " + resultPeso3/idade3);
        System.out.println("Média de peso 31 ou mais: " + resultPeso4/idade4);
    }
}