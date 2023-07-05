import java.lang.Math;

public class ati_1 {
    public static void main(String[] args) {
        double x1 = 3,x2 = 6,y1 = 2, y2 = 4,poten;

        poten = Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2);
        System.out.println(poten);
        System.out.println("o resultado é de: " + Math.sqrt(poten));
    }
}
