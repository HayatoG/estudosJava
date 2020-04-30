package Lista10;

public class Ex2 {
    public static void main(String[] args) {
        int num = 0;
        for(int i = 25; i <= 200;i++){
            if(i%2 == 0){
                num = i + num;

            }
        }
        System.out.print("\nSoma final: " + num);
    }
}
