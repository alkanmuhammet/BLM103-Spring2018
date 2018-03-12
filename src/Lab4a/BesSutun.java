package Lab4a;

/**
 * @file Matrix.java
 * @date Mar 12, 2018 , 4:39:40 PM
 * @author Muhammet Alkan
 */
public class BesSutun {

    public static void main(String[] args) {
        metod(3);
        System.out.println("");
        metod(7);
    }
    
    static void metod(int satirSayisi) {
        for (int satir = 1; satir <= satirSayisi; satir++) {
            for (int sutun = 1; sutun <= 5; sutun++) {
                System.out.print(sutun * satir + " ");
            }
            System.out.println();
        }
    }
}
