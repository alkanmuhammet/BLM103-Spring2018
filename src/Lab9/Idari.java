package Lab9;

public class Idari extends Personel {

    int rol, kademe;

    @Override
    public void increaseSalary(Maas m) {
        m.setNetOdeme(m.getNetOdeme() + 1000);
    }

    @Override
    public Maas getMaas() {
        return super.getMaas();
    }

}
