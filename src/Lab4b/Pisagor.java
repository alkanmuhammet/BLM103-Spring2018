package Lab4b;

/**
 * @file Pisagor.java
 * @date Mar 12, 2018 , 6:10:54 PM
 * @author Muhammet Alkan
 */
public class Pisagor {

    public static void main(String[] args) {

        // a^2 + b^2 = c^2
        int a = 6;
        int b = 8;

        double c = findC(a, b);

        System.out.println("kök(" + a + "^2 + " + b + "^2) = " + c);
    }

    public static double findC(int a, int b) {

        int a_kare = (int) Math.pow(a, 2);
        int b_kare = (int) Math.pow(b, 2);

        double karekok = Math.sqrt(a_kare + b_kare);
        return karekok;

        // return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
