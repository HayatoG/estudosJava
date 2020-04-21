package Lista9;

public class Ex4 {
    public static void main(String[] args) {
        int contador = 1;

        while(contador <= 20) {
            double num = Math.pow(contador, 2);
            System.out.println(contador + " - " + num);
            contador++;
        }
    }
}