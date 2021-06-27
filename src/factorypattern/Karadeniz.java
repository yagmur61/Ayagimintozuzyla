package factorypattern;

public class Karadeniz extends Turlar {

    private String turismi;
    private String kalkisNoktasi;
    private String varisNoktasi;
    private int kisiSayisi;
    private int saat;
    private int ucret;
    private int tatilSuresi;
    private int batumucret;

    public Karadeniz() {

    }

    public Karadeniz(String turismi, String kalkisNoktasi, String varisNoktasi, int kisiSayisi, int saat, int ucret, int tatilSuresi, int batumucret) {
        this.turismi = turismi;
        this.kalkisNoktasi = kalkisNoktasi;
        this.varisNoktasi = varisNoktasi;
        this.kisiSayisi = kisiSayisi;
        this.saat = saat;
        this.ucret = ucret;
        this.tatilSuresi = tatilSuresi;
        this.batumucret = batumucret;
    }

    public String getTurismi() {
        return turismi;
    }

    public void setTurismi(String turismi) {
        this.turismi = turismi;
    }

    public String getKalkisNoktasi() {
        return kalkisNoktasi;
    }

    public void setKalkisNoktasi(String kalkisNoktasi) {
        this.kalkisNoktasi = kalkisNoktasi;
    }

    public String getVarisNoktasi() {
        return varisNoktasi;
    }

    public void setVarisNoktasi(String varisNoktasi) {
        this.varisNoktasi = varisNoktasi;
    }

    public int getKisiSayisi() {
        return kisiSayisi;
    }

    public void setKisiSayisi(int kisiSayisi) {
        this.kisiSayisi = kisiSayisi;
    }

    public int getSaat() {
        return saat;
    }

    public void setSaat(int saat) {
        this.saat = saat;
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    public int getTatilSuresi() {
        return tatilSuresi;
    }

    public void setTatilSuresi(int tatilSuresi) {
        this.tatilSuresi = tatilSuresi;
    }

    public int getBatumucret() {
        return batumucret;
    }

    public void setBatumucret(int batumucret) {
        this.batumucret = batumucret;
    }

    @Override
    public String toString() {
        return "Karadeniz{" + "turismi=" + turismi + ", kalkisNoktasi=" + kalkisNoktasi + ", varisNoktasi=" + varisNoktasi + ", kisiSayisi=" + kisiSayisi + ", saat=" + saat + ", ucret=" + ucret + ", tatilSuresi=" + tatilSuresi + ", batumucret=" + batumucret + '}';
    }

    @Override
    public String getturismi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getkalkisNoktasi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getvarisNoktasi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getkisiSayisi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getsaat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getucret() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int gettatilSuresi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
