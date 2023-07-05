import java.util.Scanner;

public class ati_12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double num,acre;

        System.out.println("digite o valor do produto: ");
        num = ler.nextDouble();

        acre = num + (num * 15) / 100;
        System.out.println("o valor com desconto foi de " + acre);
    }
}
