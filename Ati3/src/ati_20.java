import java.util.Scanner;

public class ati_20 {
    public static void main(String[] args) {
        int base,altura,area;

        Scanner leia = new Scanner(System.in);

        System.out.println("digite a base do teu CUbo: ");
        base = leia.nextInt();
        System.out.println("digite a altura do teu CUbo: ");
        altura = leia.nextInt();

        area = base * altura;

        System.out.println("a area do teu CUbo é: "+area);
    }
}
