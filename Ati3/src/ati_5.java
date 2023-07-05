import java.util.Scanner;

public class ati_5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double salario_hora = 5.50,salario_total,hora;

        System.out.println("digite horas trabalhadas: ");
        hora = ler.nextDouble();
        salario_total = salario_hora * hora;
        System.out.println(" o salario diario doi de " + salario_total);
    }
}
