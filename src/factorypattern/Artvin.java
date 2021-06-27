

package factorypattern;


public  class Artvin extends Karadeniz {

    public Artvin() {
    }
    
    public Artvin(String turismi,String kalkisNoktasi,String varisNoktasi,int kisiSayisi,int saat,int ucret,int tatilSuresi, int batumucret) {
        super(turismi, kalkisNoktasi, varisNoktasi, kisiSayisi, saat, ucret, tatilSuresi,  batumucret);
    }
}
