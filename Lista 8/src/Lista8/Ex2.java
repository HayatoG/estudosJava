package Lista8;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double precoFinal = 0;

        System.out.print("Digite o valor a ser pago pelo produto: ");
        double valor = leitor.nextDouble();

        System.out.print("====Métodos de pagamento==="+
                "\n1 - À vista em dinheiro ou cheque (10% de desconto)"+
                "\n2 - À vista no cartão de crédito (15% de desconto)"+
                "\n3 - Em duas vezes, preço normal de etiqueta (s/ juros)"+
                "\n4 - Em duas vezes, preço normal de etiqueta (+10% de juros)"+
                "\n Digite a opção desejada: ");
        int opcao = leitor.nextInt();

        switch(opcao){
            case 1:
                precoFinal = valor - (valor*0.1);
                System.out.println("Preço a ser pago: R$"+precoFinal);
                break;
            case 2:
                precoFinal = valor - (valor*0.15);
                System.out.println("Preço a ser pago: R$"+precoFinal);
                break;
            case 3:
                System.out.println("Preço a ser pago: R$"+valor);
                break;
            case 4:
                precoFinal = valor + (valor*0.1);
                System.out.println("Preço a ser pago: R$"+precoFinal);
                break;
            default:
                System.out.printf("Digite SOMENTE opções entre 1 e 4\nTENTE NOVAMENTE.");
                break;
        }

    }
}
