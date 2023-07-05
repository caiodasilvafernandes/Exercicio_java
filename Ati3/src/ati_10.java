import java.util.Scanner;

public class ati_10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double dias,val_dia;

        System.out.println("digite a quantidade de dias com o carro: ");
        dias = ler.nextDouble();
        System.out.println("digite o valor da diaria: ");
        val_dia = ler.nextDouble();

        System.out.println("o valor do aluguel é de " + (dias * val_dia));
    }
}
