import java.util.Scanner;

public class ati_16 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double val,porc,desc;

        System.out.println("digite o valor do produto: ");
        val = ler.nextDouble();
        System.out.println("digite a quantidade de desconto: ");
        porc = ler.nextDouble();

        desc = val - (val * porc) / 100;

        System.out.println("o valor do desconto é " + desc);
    }
}
