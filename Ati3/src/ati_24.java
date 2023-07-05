import java.util.Scanner;

public class ati_24 {
    public static void main(String[] args) {
        int num,i;
        Scanner ler = new Scanner(System.in);

        System.out.println("digite numero: ");
        num = ler.nextInt();

        for(i = 0;i <= 10; i++){
            System.out.println(num + "X" + i + "=" +  + (num * i));
        }
    }
}
