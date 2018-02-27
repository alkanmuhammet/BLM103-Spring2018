package Lab1b;

public class Denklem2 {

    public static void main(String[] args) {

        double a = 5 / 0.0;
        System.out.println("a : " + a);

      //  double b = 5 / 0;       // java.lang.ArithmeticException: / by zero
      //  System.out.println("b : " + b);
        
        double c = 5.0 / 0;
        System.out.println("c : " + c);
    }
}
