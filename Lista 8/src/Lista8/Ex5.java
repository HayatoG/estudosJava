package Lista8;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = leitor.nextInt();

        if(idade >= 18 && idade < 70){
            System.out.printf("Você tem direito a: "+
                    "\n - Dirigir"+
                    "\n - Beber"+
                    "\n - Voto obrigatório");
        }
        else if((idade >= 16 && idade < 18) || idade >= 70){
            System.out.printf("Você tem direito a: "+
                    "\n - Voto facultativo");
            if(idade >= 70){
                System.out.printf("\n - Dirigir"+
                        "\n - Beber");
            }
        }
    }
}
