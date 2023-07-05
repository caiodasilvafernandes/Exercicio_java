import java.util.Scanner;

public class ati_25 {
    public static void main(String[] args) {
        double valor,conver;
        Scanner ler = new Scanner(System.in);

        System.out.println("digite um valor(em dolar): ");
        valor = ler.nextDouble();

        conver = valor * 4.81;

        System.out.println("o valor em real é de: " + conver);
    }
}
