package Lista10;
import java.util.Random;

public class Ex6 {
    public static void main(String[] args){
        Random random = new Random();

        int aleatorio = 0, contador = 0;

        do{
            aleatorio = random.nextInt(100);
            if(aleatorio%2 == 0){
                System.out.println("Número sorteado: " + aleatorio);
                contador++;
            }
        }while(contador < 10);
    }
}
