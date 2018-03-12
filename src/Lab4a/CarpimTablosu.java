package Lab4a;

/**
 * @file CarpimTablosu.java
 * @date Mar 12, 2018 , 5:19:24 PM
 * @author Muhammet Alkan
 */
public class CarpimTablosu {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i + "x" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
