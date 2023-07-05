import java.util.Scanner;

public class ati_19 {
    public static void main(String[] args) {
        Double ano,mes,dias;
        Scanner ler = new Scanner(System.in);

        System.out.println("digite sua idade: ");
        ano = ler.nextDouble();
        System.out.println("digite a o mes que esta(em numero)");
        mes = ler.nextDouble();

        ano = ano * 365.25;
        mes = mes * 30.4;
        dias = ano + mes;

        System.out.println("a quantidade de dias vividos foi de: " + dias);

    }
}
