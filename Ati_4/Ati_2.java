import java.lang.Math;

public class Ati_2 {
    public static void main(String[] args) {
        double num = 1.5,num2 = 5.4,angulo = 60;

        System.out.println("Arredondar um número para cima:" + Math.round(num));
        System.out.println("Arredondar um número para baixo: " + Math.floor(num));
        System.out.println("Gerar um número aleatório entre 0 e 1: " + Math.random());
        System.out.println("Calcular o valor absoluto de um número: " + Math.abs(num));
        System.out.println("Calcular o máximo entre dois números: " + Math.max(num, num2));
        System.out.println("Calcular o mínimo entre dois números: " + Math.min(num,num2));
        System.out.println("Calcular o seno de um ângulo em radianos: " + Math.sin(Math.toRadians(angulo)));
        System.out.println("Calcular o cosseno de um ângulo em radianos: " + Math.cos(Math.toRadians(angulo)));

    }
}
