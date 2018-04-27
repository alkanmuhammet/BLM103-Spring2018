package Quiz2;

/**
 * @file Grup2_Soru1.java
 * @date Apr 16, 2018 , 6:59:06 PM
 * @author Muhammet Alkan
 */
public class Grup2_Soru1 {

    public static void main(String[] args) {
        int[][] dizi = {{14, 3, 5, 2},
                        {100, 11},
                        {3, 24, 41}};

        int[] asalSayilar = asalBul(dizi);

        // bulunan asal sayıları yazdır
        for (int i = 0; i < asalSayilar.length; i++) {
            if (asalSayilar[i] != 0) {
                System.out.println(asalSayilar[i]);
            }
        }
    }

    static int[] asalBul(int[][] dizi) {
        int[] result = new int[100];

        int k = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                if (asalMi(dizi[i][j])) {
                    result[k++] = dizi[i][j];
                }
            }
        }

        return result;
    }

    static boolean asalMi(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
