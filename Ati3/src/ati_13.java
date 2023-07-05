import java.util.Scanner;

public class ati_13 {
    public static void main(String[] args) {
        Scanner ler =new Scanner(System.in);
        double val,quan;

        System.out.println("digite valor do produto: ");
        val = ler.nextDouble();
        System.out.println("digite a quantidade do produto: ");
        quan = ler.nextDouble();

        System.out.println("o valor total foi de " + (val * quan));
    }
}
