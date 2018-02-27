package Lab1a;

public class Denklem {

    public static void main(String[] args) {
        double x = 1, y = 2, z = 3;

        double sonucSol = ((x + y) * (Math.pow(x, y))) / (Math.sqrt(z + y / (5 * x)));
        double sonucSag = ((z * (3 / (x * y))) / (((7 + z))) / (y + z - ((3 * x) / (6 - y))) / Math.pow(z, 5));

        double sonuc = sonucSol + sonucSag;
        System.out.println("sonuç : " + sonuc);
    }
}
