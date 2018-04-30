package Lab8;

/**
 * @file Yazar.java
 * @date Apr 30, 2018 , 4:11:11 PM
 * @author Muhammet Alkan
 */
public class Yazar {
    // 100 Yazar kapasiteli yazarlar dizisi
    static Yazar[] yazarlar = new Yazar[100];
    static int yazarSayisi = 0;

    public String name;
    private String email;
    private char gender;

    public Yazar() {
        // özellikleri boş olan Yazar nesnesi oluşturur
        this(null, null, ' ');
    }

    public Yazar(String name, String email, char gender) {
        // parametre olarak verilen özelliklerle Yazar nesnesi oluşturur
        this.name = name;
        this.email = email;
        this.gender = gender;

        // yazarlar dizisine oluşan Yazar nesnesini koyar
        // ve yazarSayisi değişkenine 1 ekler
        yazarlar[yazarSayisi++] = this;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        // String karşılaştırması yapılacaksa "equals" metodu tercih edilmeli
        if (!newName.equals("")) {
            this.name = newName;
        }
    }

    @Override
    public String toString() {
        return "[" + name + " , " + email + " , " + gender + "]";
    }

    public void metod() {
        System.out.println("Yazar, normal metod");
    }

    public static void metodStatic() {
        System.out.println("Yazar, static metod");
    }

}
