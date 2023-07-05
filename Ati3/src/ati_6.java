import java.util.Scanner;

public class ati_6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int dia,hora,min,seg;

        System.out.println("digite dias: ");
        dia = ler.nextInt();
        System.out.println("digite horas: ");
        hora = ler.nextInt();
        System.out.println("digite minutos: ");
        min = ler.nextInt();
        System.out.println("digite segundos: ");
        seg = ler.nextInt();

        dia = dia * 86400;
        hora = hora * 3600;
        min = min * 60;

        System.out.println("a soma dos segundos é de " + (dia + hora + min + seg));
    }
}
