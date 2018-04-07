package Quiz1;

/**
 * @file Soru8.java
 * @date Apr 7, 2018 , 1:44:27 PM
 * @author Muhammet Alkan
 */
public class Soru8 {

    public static void main(String args[]) {

        int x = 2;
        int y = 0;

        for (; y < 10; ++y) {
            if (y % x == 0) {
                continue;
            } else if (y == 8) {
                break;
            } else {
                System.out.print(y + " ");
            }
        }
    }
}
