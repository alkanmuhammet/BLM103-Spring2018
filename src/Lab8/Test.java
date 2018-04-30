package Lab8;

/**
 * @file Test.java
 * @date Apr 30, 2018 , 4:12:49 PM
 * @author Muhammet Alkan
 */
public class Test {

    public static void main(String[] args) {
        Yazar y1; // null
        y1 = new Yazar();

//        y1.name = "yazar1";
//        y1.email = "email1";
//        y1.gender = 'm';
        y1.metod();

        Yazar y2 = new Yazar("Ayşe", "ayşe@mail.com", 'f');
        System.out.println(y1);
        System.out.println(y2);

        y2.setName("");
        System.out.println(y2.getName());

        //Yazar.staticValue;
        System.out.println("Toplam oluşturulan yazar sayısı : " + Yazar.yazarSayisi);

        // oluşturulan yazarları yazdır
        for (int i = 0; i < Yazar.yazarlar.length; i++) {
            // sadece yazar içeren elemanları yazdırması için null kontrolü gerekli
            // !! yazarlar listesi 100 elemanlı idi !!
            if (Yazar.yazarlar[i] != null) {
                System.out.println("Yazar " + i + " : " + Yazar.yazarlar[i]);
            }

        }
    }
}
