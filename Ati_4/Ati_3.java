import java.lang.Math;

public class Ati_3 {
    public static void main(String[] args) {
        double angulo = 60;

        System.out.println("Calcular a tangente de um ângulo (VALOR) em radianos: " + Math.tan(Math.toRadians(angulo)));
        System.out.println("Calcular o arco seno do VALOR " + Math.asin(angulo));
        System.out.println("Calcular o arco cosseno do VALOR " + Math.acos(angulo));
        System.out.println("Calcular o arco tangente do VALOR " + Math.atan(angulo));
        System.out.println("Calcular o logaritmo natural do VALOR " + Math.log(angulo));

        //Segundo o arquivo que o Jucemar havia passado, o comando é correto porém o resultado sai como NaN
        //nas atividades do arco seno e cosseno.
    }
}
