import java.util.Scanner;

public class ati_17 {
    public static void main(String[] args) {
        double valor,resul;
        int parc;
        Scanner ler = new Scanner(System.in);

        System.out.println("digite o valor do produto: ");
        valor = ler.nextDouble();
        System.out.println("digite quantidade de parcelas: ");
        parc = ler.nextInt();

        resul = valor / parc;

        System.out.println("o valor de cada parcela é de " + resul);
    }
}
