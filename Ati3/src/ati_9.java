import java.util.Scanner;

public class ati_9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double L_abastecido,val_litro;

        System.out.println("digite o valor do litro de gasolina: ");
        val_litro = ler.nextDouble();
        System.out.println("digite a quantidade de gasolina abastecida: ");
        L_abastecido = ler.nextDouble();

        System.out.println("o valor a ser pago é de " + (L_abastecido * val_litro));
    }
}
