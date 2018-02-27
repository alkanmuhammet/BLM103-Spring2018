package Lab1b;

public class IncrementDecrement {

    public static void main(String[] args) {
        int k = 6;

        //  k = k + 1;
        //  k += 1;
        int sonuc = (2 * k++) + (--k);        // (2*6) + (6)

        System.out.println("k : " + k);
        System.out.println("sonuc : " + sonuc);
    }
}
