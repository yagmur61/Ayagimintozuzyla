package factorypattern;

public  class Trabzon extends Karadeniz {

    public Trabzon() {
    }

    public Trabzon(String turismi, String kalkisNoktasi, String varisNoktasi, int kisiSayisi, int saat, int ucret, int tatilSuresi, int batumucret) {
        super(turismi, kalkisNoktasi, varisNoktasi, kisiSayisi, saat, ucret, tatilSuresi, batumucret);
    }
}
