package Lab10.MalTanim;

/**
 * @file Bilgisayar.java
 * @date May 14, 2018 , 4:42:09 PM
 * @author Muhammet Alkan
 */
public final class Bilgisayar extends Malzeme {

    public int RAMHiz;
    public int CPUHiz;

    @Override
    public String toString() {
        return "Bilgisayar(RAMHiz = " + RAMHiz + " , CPUHiz = " + CPUHiz + ")";
    }

    
    static void metodStatic() {
        System.out.println("Bilgisayar sınıfındaki static metod");
    }

    public static void main(String[] args) {
        Bilgisayar b1 = new Bilgisayar();
        b1.metod();
        b1.CPUHiz = 5;
        b1.RAMHiz = 1;

        // nesne olusturmaya gerek yok
        Bilgisayar.metodStatic();
        // ayni sinifta ise sinif ismine gerek yok
        // static metodun ismiyle erisilebilir
        metodStatic();
    }
}
