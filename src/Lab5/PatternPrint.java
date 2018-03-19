package Lab5;

/**
 * @file PatternPrint.java
 * @date Mar 19, 2018 , 5:35:24 PM
 * @author Muhammet Alkan
 */
public class PatternPrint {

    public static void main(String[] args) {
        metod_(9);
    }

    public static void metod_(int satirSayisi) {

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < satirSayisi; j++) {
                if (i <= j) {
                    System.out.print(satirSayisi - j + "\t");
                } else {
                    System.out.print("_\t");
                }
            }
            System.out.println();
        }
    }

    public static void metod(int satirSayisi) {

        for (int i = 0; i < satirSayisi; i++) {
            for (int j = 0; j < satirSayisi; j++) {

                if (i <= j) {
                    System.out.print(satirSayisi - j + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
