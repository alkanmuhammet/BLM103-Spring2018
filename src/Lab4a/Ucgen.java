package Lab4a;

/**
 * @file Ucgen.java
 * @date Mar 12, 2018 , 5:10:52 PM
 * @author Muhammet Alkan
 */
public class Ucgen {

    public static void main(String[] args) {

        for (int satir = 1; satir < 10; satir++) {
            for (int sutun = satir; sutun > 0; sutun--) {
                System.out.print(sutun + " ");
            }
            System.out.println();
        }

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i - j + 1) + " ");
            }
            System.out.println();
        }
    }
}
