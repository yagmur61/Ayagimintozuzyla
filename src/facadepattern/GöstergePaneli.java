package facadepattern;

public class GöstergePaneli {

    private Turlar Karadeniz;
    private Turlar Kapadokya;
    private Turlar Pamukkale;
    private Turlar Amasya;
    private Turlar Nemrut;

    public GöstergePaneli() {

        Karadeniz = new Karadeniz();
        Kapadokya = new Kapadokya();
        Pamukkale = new Pamukkale();
        Amasya = new Amasya();
        Nemrut =  new Nemrut();

    }

    public void TurDetaylariKaradeniz(){
        Karadeniz.TurDetaylari();
    }
    
    public void TurDetaylariKapadokya(){
        Kapadokya.TurDetaylari();
    }
    public void TurDetaylariPamukkale(){
        Pamukkale.TurDetaylari();
    }
    public void TurDetaylariAmasya(){
        Amasya.TurDetaylari();
    }
    public void TurDetaylariNemrut(){
       Nemrut.TurDetaylari();
    }
    
}
