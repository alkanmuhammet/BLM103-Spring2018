package Quiz1;

/**
 * @file Soru6.java
 * @date Apr 7, 2018 , 1:39:00 PM
 * @author Muhammet Alkan
 */
public class Soru6 {

    public static void main(String[] args) {

        boolean sayiYaz = true;

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print("F");
                sayiYaz = false;
            }
            
            if (i % 5 == 0) {
                System.out.print("S");
                sayiYaz = false;
            }
            
            if (i % 7 == 0) {
                System.out.print("M");
                sayiYaz = false;
            }

            if (sayiYaz) {
                System.out.print(i);
            }

            System.out.print(" ");
            sayiYaz = true;
        }

        System.out.println();
    }

}
