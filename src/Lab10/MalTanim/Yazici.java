package Lab10.MalTanim;

/**
 * @file Yazici.java
 * @date May 14, 2018 , 4:43:14 PM
 * @author Muhammet Alkan
 */
public class Yazici extends Malzeme {

    public int kartusOmru;

    public Yazici() {
        kartusOmru = 5;
    }

    public Yazici(int omur) {
        kartusOmru = omur;
    }
    
    @Override
    public String toString() {
        return "Yazici(kartusOmru = " + kartusOmru + ")";
    }
}
