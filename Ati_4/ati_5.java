import java.util.Scanner;
import java.lang.Math;

public class ati_5 {
    public static void main(String[] args) {
        double cateto_op,hipote;
        Scanner ler = new Scanner(System.in);

        System.out.println("digite o cateto oposto: ");
        cateto_op = ler.nextDouble();
        System.out.println("digite a hipotenusa: ");
        hipote = ler.nextDouble();

        System.out.println("O valor do cateto adjacente é: " + Math.sqrt(Math.pow(hipote,2 ) - Math.pow(cateto_op, 2)));
    }
}
