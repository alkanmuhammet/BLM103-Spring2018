package Quiz1;

/**
 * @file Soru3.java
 * @date Apr 7, 2018 , 1:19:45 PM
 * @author Muhammet Alkan
 */
public class Soru3 {

    public static double uzaklik(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    
    // test
    public static void main(String[] args) {
        double d = uzaklik(2, 1, 2, 5);
        System.out.println("(2,1) - (2,5) => " + d);

        System.out.println("(3,5) - (4,8) => " + uzaklik(3, 5, 4, 8));
    }

}
