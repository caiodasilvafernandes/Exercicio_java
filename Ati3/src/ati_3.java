import java.util.Scanner;

public class ati_3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float base,altura;

        System.out.println("digite a base do triangulo: ");
        base = ler.nextFloat();
        System.out.println("digite a altura do triangulo: ");
        altura = ler.nextFloat();

        System.out.println("a area do triangulo é " + (base + altura)/2);

    }
}
