import java.util.Scanner;

public class ati_21 {
    public static void main(String[] args) {
        double alt,kg,imc;
        Scanner ler = new Scanner(System.in);

        System.out.println("digite sua altura em metro:");
        alt = ler.nextDouble();
        System.out.println("digite seu peso em kilos: ");
        kg = ler.nextDouble();

        imc = kg / (alt * alt);

        System.out.println("o seu imc é " + imc);
    }
}
