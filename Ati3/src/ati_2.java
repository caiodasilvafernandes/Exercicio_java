import java.util.Scanner;

public class ati_2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double pi,raio;
        pi = 3.14;
        System.out.println("digite o raio: ");
        raio = ler.nextDouble();
        System.out.println("o valor da area é " + (pi * (raio * raio)));
    }
}
