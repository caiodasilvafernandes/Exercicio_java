import java.util.Scanner;

public class ati_7 {
    public static void main(String[] args) {
        int num,num2;
        Scanner ler = new Scanner(System.in);

        System.out.println("digite numero A: ");
        num = ler.nextInt();
        System.out.println("digite numero b: ");
        num2 = ler.nextInt();

        System.out.println("a multiplicaçao entre os numeros é de " + (num * num2));
    }
}
