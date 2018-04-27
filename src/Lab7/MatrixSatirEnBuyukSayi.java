package Lab7;

/**
 * @file MatrixSatirEnBuyukSayi.java
 * @date Apr 16, 2018 , 4:32:47 PM
 * @author Muhammet Alkan
 */
public class MatrixSatirEnBuyukSayi {

    public static void main(String[] args) {
        int[][] dizi = {{14, 3, 85, 2},
                        {100, 11},
                        {3, 24, 106}};

        int[] satirBuyukleri = satirBuyukleri(dizi);
        // int[] satirBuyukleri = satirBuyukleri2(dizi);

        for (int i = 0; i < satirBuyukleri.length; i++) {
            System.out.println(satirBuyukleri[i]);
        }
    }

    static int[] satirBuyukleri(int[][] dizi) {
        int[] result = new int[dizi.length];

        int max;
        for (int i = 0; i < dizi.length; i++) {

            max = dizi[i][0];
            for (int j = 1; j < dizi[i].length; j++) {
                if (dizi[i][j] > max) {
                    max = dizi[i][j];
                }
            }
            result[i] = max;

        }

        return result;
    }

    // farklı bir değişkene ihtiyaç duymadan
    static int[] satirBuyukleri2(int[][] dizi) {
        int[] result = new int[dizi.length];

        for (int i = 0; i < dizi.length; i++) {

            result[i] = dizi[i][0];
            for (int j = 1; j < dizi[i].length; j++) {
                if (dizi[i][j] > result[i]) {
                    result[i] = dizi[i][j];
                }
            }
        }

        return result;
    }
}
