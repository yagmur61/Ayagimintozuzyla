package factorypattern;

public class TurlarFactory {

    public static Turlar getKaradenizTurlar(String type, String turismi, String kalkisNoktasi, String varisNoktasi, int kisiSayisi, int saat, int ucret, int tatilSuresi, int batumucret) {

        if ("Karadeniz".equalsIgnoreCase(type)) {
            return new Karadeniz(turismi, kalkisNoktasi, varisNoktasi, kisiSayisi, saat, ucret, tatilSuresi, batumucret);
        } else if ("Trabzon".equalsIgnoreCase(type)) {
            return new Trabzon(turismi, kalkisNoktasi, varisNoktasi, kisiSayisi, saat, ucret, tatilSuresi, batumucret);
        } else if ("Artvin".equalsIgnoreCase(type)) {
            return new Artvin(turismi, kalkisNoktasi, varisNoktasi, kisiSayisi, saat, ucret, tatilSuresi, batumucret);
        }
        return null;

    }

    public static Turlar getKapadokyaTurlar(String type, String turismi, String kalkisNoktasi, String varisNoktasi, int kisiSayisi, int saat, int ucret, int tatilSuresi, int balonucret) {

        if ("Kapadokya".equalsIgnoreCase(type)) {
            return new Kapadokya(turismi, kalkisNoktasi, varisNoktasi, kisiSayisi, saat, ucret, tatilSuresi, balonucret);
        } else if ("Göreme".equalsIgnoreCase(type)) {
            return new Göreme(turismi, kalkisNoktasi, varisNoktasi, kisiSayisi, saat, ucret, tatilSuresi, balonucret);
        } else if ("Ürgüp".equalsIgnoreCase(type)) {
            return new Ürgüp(turismi, kalkisNoktasi, varisNoktasi, kisiSayisi, saat, ucret, tatilSuresi, balonucret);
        }
        return null;
    }

    public static Turlar getAmasyaTurlar(String type, String turismi, String kalkisNoktasi, String varisNoktasi, int kisiSayisi, int saat, int ucret, int tatilSuresi, int yas) {
        if ("Amasya".equalsIgnoreCase(type)) {
            return new Amasya(turismi, kalkisNoktasi, varisNoktasi, kisiSayisi, saat, ucret, tatilSuresi, yas);
        } else if ("Merzifon".equalsIgnoreCase(type)) {
            return new Merzifon(turismi, kalkisNoktasi, varisNoktasi, kisiSayisi, saat, ucret, tatilSuresi, yas);
        } else if ("Tasova".equalsIgnoreCase(type)) {
            return new Tasova(turismi, kalkisNoktasi, varisNoktasi, kisiSayisi, saat, ucret, tatilSuresi, yas);
        }
        return null;
    }

}
