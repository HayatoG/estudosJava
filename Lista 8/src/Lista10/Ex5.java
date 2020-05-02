package Lista10;
import java.util.Scanner;

public class Ex5 {
    public static void main(String [] args){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = leitor.next();

        int total = 0;
        for(int i = 0; i< palavra.length(); i++){
            if(palavra.charAt(i)== 'A'){
                total++;
            }
        }
        System.out.println("Total de letras 'A' na palavra: " + total);
    }
}
