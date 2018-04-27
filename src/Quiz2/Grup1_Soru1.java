package Quiz2;

/**
 * @file Grup1_Soru1.java
 * @date Apr 16, 2018 , 6:58:55 PM
 * @author Muhammet Alkan
 */
public class Grup1_Soru1 {

    public static void main(String[] args) {
        int[][] dizi = {{14, 3, 85, 2},
                        {100, 11},
                        {3, 24, 106}};

        int sayi = 2;
        int[][] carpimMatrix = matrixCarp(sayi, dizi);

        // sonuc matrix ini yazdır
        for (int i = 0; i < carpimMatrix.length; i++) {
            for (int j = 0; j < carpimMatrix[i].length; j++) {
                System.out.print(carpimMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int[][] matrixCarp(int sayi, int[][] dizi) {
        // her satırda farklı sayıda sütun olabilir
        int[][] result = new int[dizi.length][];

        // parametre olarak alınan 2 boyutlu dizi(matrix) ile aynı boyutlarda
        // yeni bir dizi(matrix) oluşturulup, işlemler onun üzerinden yapılacak
        for (int i = 0; i < dizi.length; i++) {
            result[i] = new int[dizi[i].length];
        }

        
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = dizi[i][j] * sayi;
            }
            sayi++;
        }

        return result;
    }
}
