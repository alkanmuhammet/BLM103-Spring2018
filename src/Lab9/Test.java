package Lab9;

public class Test {

    public static void main(String[] args) {
        Maas m1 = new Maas();
        m1.setNetOdeme(5000);
        m1.setKomisyon(1500);

        // Personel p = new Personel("Ahmet", "Ak",m1);
        Personel p = new Personel();
        p.adi = "Ahmet";
        p.soyadi = "Ak";
        p.setMaas(m1);

        System.out.println("Personel toplam maas  : " + m1.findTotalSalary());
        p.increaseSalary(m1);
        System.out.println("Personel toplam maas +: " + m1.findTotalSalary());

        Idari i1 = new Idari();
        i1.setMaas(m1);

        System.out.println("Idari toplam maas  : " + i1.getMaas().findTotalSalary());
        i1.increaseSalary(m1);
        System.out.println("Idari toplam maas +: " + i1.getMaas().findTotalSalary());
    }

}
