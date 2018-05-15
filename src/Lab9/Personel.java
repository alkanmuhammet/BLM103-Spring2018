package Lab9;

public class Personel {

    String adi, soyadi;
    int iseGirisTarihi;
    private Maas maas;

    public Personel() {
    }

    public Personel(String adi, String soyadi, Maas maas) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.maas = maas;
    }

    public Maas getMaas() {
        return maas;
    }

    public void setMaas(Maas maas) {
        this.maas = maas;
    }

    public void increaseSalary(Maas m) {
        maas.setNetOdeme(maas.getNetOdeme() + 500);
    }

}