package Lab4a;

/**
 * @file Fibonacci.java
 * @date Mar 12, 2018 , 4:12:34 PM
 * @author Muhammet Alkan
 */
public class Fibonacci {

    public static void main(String[] args) {
        /*
        int t1 = 0;
        int t2 = 1;
        
        
        for (int i = 0; i < 10; i++) {
            System.out.print(t1 + " ");
            int t3 = t1 + t2;
            
            t1 = t2;
            t2 = t3;
        }
         */
        
        fibonacci(10);
        fibonacci(20);

    }

    static void fibonacci(int step) {
        int t1 = 0;
        int t2 = 1;

        for (int i = 0; i < step; i++) {
            System.out.print(t1 + " ");
            int t3 = t1 + t2;

            t1 = t2;
            t2 = t3;
        }
        System.out.println();
    }
}
