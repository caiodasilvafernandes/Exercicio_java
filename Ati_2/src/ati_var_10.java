import java.util.Scanner;

public class ati_var_10 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner ler = new Scanner(System.in);
        System.out.println("digite numero A: ");
        a = ler.nextInt();
        System.out.println("digite numero B: ");
        b = ler.nextInt();
        System.out.println("digite numero c: ");
        c = ler.nextInt();
        c = a;
        a = b;
        b = c;
        System.out.println("o valor de A é " + a + " e o B é " + b);
    }
}
