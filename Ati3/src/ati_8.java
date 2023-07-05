import java.util.Scanner;

public class ati_8 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double num,desc;

        System.out.println("digite o valor do produto: ");
        num = ler.nextDouble();

        desc = num - (num * 10) / 100;
        System.out.println("o valor com desconto foi de " + desc);
    }
}
