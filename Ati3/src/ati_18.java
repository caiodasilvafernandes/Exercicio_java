import java.util.Scanner;

public class ati_18 {
    public static void main(String[] args) {
        int data, ano, nas;
        String nome;

        Scanner leia = new Scanner(System.in);

        System.out.println("digite seu nome: ");
        nome = leia.nextLine();
        System.out.println("digite sua idade: ");
        data = leia.nextInt();
        System.out.println("em qual ano estamos: ");
        ano = leia.nextInt();

        nas = ano - data;

        System.out.println("você nasceu em: " + nas );


    }
}

