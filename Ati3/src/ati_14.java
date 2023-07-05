import java.util.Scanner;

public class ati_14 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;

        System.out.println("digite numero: ");
        num = ler.nextInt();

        num = num * num * num;

        System.out.println("o cubo do numero é de " + num);
    }
}
