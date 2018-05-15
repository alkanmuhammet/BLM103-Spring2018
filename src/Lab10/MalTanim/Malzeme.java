package Lab10.MalTanim;

/**
 * @file Malzeme.java
 * @date May 14, 2018 , 4:41:30 PM
 * @author Muhammet Alkan
 */
public class Malzeme {

    public String adi;

    // ilk değeri degiştirilemez - final
    public final String kurum = "FSMVU";

    // sınıf degişkeni - static 
    public static String turu;

    final void metod() {
        System.out.println("Malzeme sınıfındaki final metod");
    }

    @Override
    public String toString() {
        return "Malzeme(adi = " + adi + " , turu = " + turu + ")";
    }
}
