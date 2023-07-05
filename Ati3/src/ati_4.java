import java.util.Scanner;

public class ati_4 {
    public static void main(String[] args) {
        double num;
        Scanner ler = new Scanner(System.in);
        System.out.println("digite graus celsius: ");
        num = ler.nextDouble();
        System.out.println("a conversão de graus celsius para Fahrenheit foi " + ((num * 1.8) +  32));
    }
}