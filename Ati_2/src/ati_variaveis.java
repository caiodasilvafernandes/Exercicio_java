import java.util.Scanner;

public class ati_variaveis {
    public static void main(String[] args) {
        String nome,cidade;

        Scanner ler = new Scanner(System.in);

        System.out.println("atividade 1");
        System.out.println("digite seu nome: ");
        nome = ler.nextLine();
        System.out.println("digite sua cidade: ");
        cidade = ler.nextLine();

        System.out.println("ola " + nome + ", você mora em " + cidade);
    }
}