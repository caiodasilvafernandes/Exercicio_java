import java.util.Scanner;

public class Ati_4 {
    public static void main(String[] args) {
        double raio;
        Scanner ler = new Scanner(System.in);

        // Calcular a área de um círculo, sendo fornecido pelo usuário o RAIO.
        System.out.println("atividade A");
        System.out.println();

        System.out.println("digite o raio: ");
        raio = ler.nextDouble();
        raio = Math.pow(raio,2);

        System.out.println("A area do circulo é: " + (3.14 * raio));


        //Calcular a circunferência de um círculo, onde o usuário informa o RAIO.

        //a variavel raio foi reutilizada

        System.out.println();
        System.out.println("atividade B");
        System.out.println();

        System.out.println("digite raio: ");
        raio = ler.nextDouble();

        System.out.println("A circunferencia é de " + (2 * 3.14) * raio);

        //Calcular a hipotenusa de um triângulo retângulo, onde o usuário fornece o CATETO1 e CATETO2

        System.out.println();
        System.out.println("atividade C");
        System.out.println();

        double cateto_ad, cateto_op,soma_catetos;

        System.out.println("escreva cateto adjacente: ");
        cateto_ad = ler.nextInt();
        System.out.println("escreva cateto oposto: ");
        cateto_op = ler.nextInt();

        soma_catetos = Math.pow(cateto_ad,2) +  Math.pow(cateto_op,2);

        System.out.println("A hipotenusa é " + Math.sqrt(soma_catetos));

        // Calcular o perímetro de um retângulo:

        System.out.println();
        System.out.println("atividade D");
        System.out.println();

        double lado_A,lado_B;

        System.out.println("digite o valor do lado A: ");
        lado_A = ler.nextDouble();
        System.out.println("digite o valor do lado B:" );
        lado_B = ler.nextDouble();

        System.out.println("A area do retangulo é " + 2*(lado_A + lado_B));
        //Calcular a área de um triângulo, sendo fornecido pelo usuário a BASE e a ALTURA do triângulo

        System.out.println();
        System.out.println("atividade E");
        System.out.println();

        float base, altura;

        System.out.println("digite a altura do triangulo: ");
        altura = ler.nextFloat();
        System.out.println("digite a base do triangulo: ");
        base = ler.nextFloat();

        System.out.println("A area do triangulo é " +  (base * altura) / 2);
    }
}
