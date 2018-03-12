package Lab4b;

/**
 * @file NestedForLoops.java
 * @date Mar 12, 2018 , 6:26:08 PM
 * @author Muhammet Alkan
 */
public class NestedForLoops {

    public static void main(String[] args) {

        // kare 5x5
        for (int satir = 0; satir < 5; satir++) {   // satır
            for (int sutun = 0; sutun < 5; sutun++) {   // sütun
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("");
        
        // dik üçgen, yıldız
        for (int satir = 0; satir < 5; satir++) {   // satır
            for (int sutun = 0; sutun < satir; sutun++) {   // sütun
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("");
        
        // dik üçgen, artan sayılar
        int counter = 1;
        for (int satir = 0; satir < 5; satir++) {//satir
            for (int sutun = 0; sutun <= satir; sutun++) {//sutun
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
}
