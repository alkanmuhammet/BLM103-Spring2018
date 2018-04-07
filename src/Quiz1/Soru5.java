package Quiz1;

/**
 * @file Soru5.java
 * @date Apr 7, 2018 , 1:34:20 PM
 * @author Muhammet Alkan
 */
public class Soru5 {

    public static void main(String[] args) {
        
        // satır ve sütun sayısı
        int n = 6;

        System.out.println("çözüm 1 ");
        for (int i = 1; i <= n; i++) {
            int sinir = n - i;

            for (int j = 1; j <= n; j++) {

                if (j <= sinir) {
                    System.out.print(" ");
                } else {
                    System.out.print(n - j + 1);
                }

                System.out.print(" ");
            }

            System.out.println();
        }

        System.out.println("\nçözüm 2");
        for (int i = 1; i <= 6; i++) {
            for (int k = 1; k <= 6 - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
