package Lab7;

/**
 * @file MatrixSatirEnBuyukFark.java
 * @date Apr 16, 2018 , 6:35:32 PM
 * @author Muhammet Alkan
 */
public class MatrixSatirEnBuyukFark {

    public static void main(String[] args) {
        int[][] dizi = {{14, 3, 85, 2},
                        {100, 11},
                        {3, 24, 106}};

        int[] satirEnBuyukFarklari = satirFarklari(dizi);

        for (int i = 0; i < satirEnBuyukFarklari.length; i++) {
            System.out.println(satirEnBuyukFarklari[i]);
        }
    }

    static int[] satirFarklari(int[][] dizi) {
        int[] result = new int[dizi.length];

        int max, min;
        for (int i = 0; i < dizi.length; i++) {

            max = dizi[i][0];
            min = dizi[i][0];
            for (int j = 1; j < dizi[i].length; j++) {
                if (dizi[i][j] > max) {
                    max = dizi[i][j];
                }
                if (dizi[i][j] < min) {
                    min = dizi[i][j];
                }
            }
            result[i] = max - min;

        }

        return result;
    }
}
