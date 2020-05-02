package Lista10;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome, nomeMaior = "";
        int altura = 0, maior = 0, soma = 0;

        System.out.println("Este exercício corresponde ao 3a, 3b e 3c unificados.");

        for(int i = 0; i < 5; i ++) {
            System.out.print("\nDigite o nome do atleta: ");
            nome = leitor.next();
            System.out.print("Digite a altura de " + nome +": ");
            altura = leitor.nextInt();

            soma += altura;
            if(altura  > maior){
                maior = altura;
                nomeMaior = nome;
            }
        }
        System.out.println("\nMaior atleta: " + nomeMaior + " de altura: " + maior);
        System.out.print("A média de altura dos atlétas é: " + (soma/5));
    }
}
