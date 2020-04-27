package Lista2;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe uma temperatura em Graus Celsius: ");
        double celsius = leitor.nextDouble();

        double kelvin = celsius + 273.15;
        double fah = (celsius * 9/5) + 32;

        System.out.print("Temperatura informada: " + celsius + "Cº\n" + celsius + "ºC em Kelvin: " + kelvin + "K\n" + celsius + "Cº em Fahrenheit: " + fah + "ºF");
    }
}
