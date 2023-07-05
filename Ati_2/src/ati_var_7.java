import java.util.Scanner;

public class ati_var_7 {
    public static void main(String[] args) {
        String nome,cidade;
        int idade;
        Scanner ler = new Scanner(System.in);

        System.out.println("atividade 1");
        System.out.println("digite seu nome: ");
        nome = ler.nextLine();
        System.out.println("digite sua cidade: ");
        cidade = ler.nextLine();
        System.out.println("digite sua idade: ");
        idade = ler.nextInt();

        System.out.println("ola " + nome + ", você mora em " + cidade + " e tem " + idade + "de idade");
    }
}
