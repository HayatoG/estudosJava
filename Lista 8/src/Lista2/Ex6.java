package Lista2;
import java.util.Scanner;

public class Ex6 {
   public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);

       System.out.print("Digite o nome do vendedor: ");
       String nome = leitor.nextLine();

       System.out.print("Digite seu salário fixo: ");
       double salario = leitor.nextDouble();

       System.out.print("Digite o total de venda no mês (Em dinheiro): ");
       double vendas = leitor.nextDouble();

       double totalMes = salario + ((vendas*0.15));

       System.out.print("Qtd: " + totalMes);
   }
}

