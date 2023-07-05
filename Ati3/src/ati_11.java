import java.util.Scanner;

public class ati_11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;

        System.out.println("digite numero: ");
        num = ler.nextInt();

        num = num * num;

        System.out.println("o quadrado do numero é de " + num);
    }
}
