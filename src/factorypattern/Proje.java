package factorypattern;

import java.util.Scanner;

public class Proje {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tur Rehberine Hoşgeldiniz...");

        String turlar = "Turlar... \n"
                + "* Karadeniz Turu için K'ya \n"
                + "* Kapadokya Turu için P'ye \n"
                + "* Amasya Turu için A'ya \n"
                + "* Çıkmak için 0'a basınız.";
        System.out.println("\n \n \n ");
        System.out.println(turlar);
        System.out.println("\n \n \n ");

        while (true) {

            System.out.print("---Gitmek istediğiniz turu seçiniz: \n \n ");
            String tur = scanner.nextLine();

            if (tur.equals("0")) {
                System.out.println("Tur Rehberinden çıkış yapılıyor..");
                break;

            } else if (tur.equals("K")) {
                

                System.out.println("\n");
                System.out.println("--Gezmek İstediğiniz İli seçiniz.\n");
                String gezi_tur = "Gezilecek Yerler\n"
                        + "  -> Trabzon için 1'e basınız.\n"
                        + "  -> Artvin için 2'e basınız.\n"
                        + "  -> Çıkış için 0'a basınız.";

                System.out.println(gezi_tur);
                System.out.println("\n \n ");
                while (true) {
                    System.out.println("****Karadeniz Turu Seçiniz ");
                    String g_tur = scanner.nextLine();
                    System.out.println("\n \n ");

                    if (g_tur.equals("0")) {
                        System.out.println("Karadeniz Tur Rehberinden Çıkılıyor");
                        break;

                    } else if (g_tur.equals("1")) {

                        System.out.println(">>Trabzon Turu seçildi.\n ");

                        Turlar Trabzon = TurlarFactory.getKaradenizTurlar("Trabzon", "Karadeniz", "İnönü Caddesi", "Trabzon Meydan", 22, 7, 1300, 4, 500);
                        System.out.println("Seçiminiz: \n" + Trabzon);
                        break;

                    } else if (g_tur.equals("2")) {

                        System.out.println(">>Artvin Turu seçildi.\n ");
                        Turlar Artvin = TurlarFactory.getKaradenizTurlar("Artvin", "Karadeniz", "İnönü Caddesi", "Artvin Meydan", 30, 7, 1500,4, 300);
                        System.out.println("Seçiminiz: \n \n" + Artvin);
                        break;

                    } else {
                        System.out.println("Geçersiz Tur seçim işlemi...");
                    }

                }

            } else if (tur.equals("P")) {
                

                System.out.println("\n ");
                System.out.println("--Gezmek İstediğiniz İli seçiniz.\n");
                String gezi_tur = "Gezilecek Yerler\n"
                        + "  -> Göreme için 1'e basınız.\n"
                        + "  -> Ürgüp  için 2'e basınız.\n"
                        + "  -> Çıkış için 0'a basınız.";

                System.out.println(gezi_tur);
                System.out.println("\n \n ");

                while (true) {
                    System.out.println("****Kapadokya Turu Seçiniz ");
                    String g_tur = scanner.nextLine();
                    System.out.println("\n \n  ");

                    if (g_tur.equals("0")) {
                        System.out.println("Kapadokya Tur Rehberinden Çıkılıyor");
                        break;

                    } else if (g_tur.equals("1")) {

                        System.out.println(">>Göreme Turu seçildi.\n ");

                        Turlar Göreme = TurlarFactory.getKapadokyaTurlar("Göreme", "Kapadokya", "İnönü Caddesi", "Kapadokya Meydan", 18, 15, 300, 2, 1500);
                        System.out.println("Seçiminiz: \n" + Göreme);
                        break;

                    } else if (g_tur.equals("2")) {

                        System.out.println(">>Ürgüp Turu seçildi.\n ");
                        Turlar Ürgüp = TurlarFactory.getKapadokyaTurlar("Ürgüp", "Kapadokya", "İnönü Caddesi", "Kapadokya Meydan", 20, 15, 300, 2, 1500);
                        System.out.println("Seçiminiz: \n \n" + Ürgüp);
                        break;

                    } else {
                        System.out.println("Geçersiz Tur seçim işlemi...");
                    }

                }
                
                
                
                
                
            } else if (tur.equals("A")) {
                

                System.out.println("\n ");
                System.out.println("--Gezmek İstediğiniz İli seçiniz.\n");
                String gezi_tur = "Gezilecek Yerler\n"
                        + "  -> Tasova için 1'e basınız.\n"
                        + "  -> Merzifon  için 2'e basınız.\n"
                        + "  -> Çıkış için 0'a basınız.";

                System.out.println(gezi_tur);
                System.out.println("\n \n ");

                while (true) {
                    System.out.println("****Amasya Turu Seçiniz ");
                    String g_tur = scanner.nextLine();
                    System.out.println("\n \n ");

                    if (g_tur.equals("0")) {
                        System.out.println("Amasya Tur Rehberinden Çıkılıyor");
                        break;

                    } else if (g_tur.equals("1")) {

                        System.out.println(">>Tasova Turu seçildi. \n");

                        Turlar Tasova = TurlarFactory.getAmasyaTurlar("Tasova", "Amasya", "İnönü Caddesi", "Amasya Heykel", 16, 12, 300, 2, 15);
                        System.out.println("Seçiminiz: \n \n" + Tasova);
                        break;

                    } else if (g_tur.equals("2")) {

                        System.out.println(">>Merzifon Turu seçildi. \n");
                        Turlar Merzifon = TurlarFactory.getAmasyaTurlar("Merzifon", "Amasya", "İnönü Caddesi", "Merzifon Heykel", 20, 12, 300, 2, 15);
                        System.out.println("Seçiminiz: \n \n" + Merzifon);
                        break;
            
            
            
            
                    } else {
                        System.out.println("Geçersiz Gezi Turu seçim işlemi...");
                    }

                }
       
            } else {
                System.out.println("Geçersiz tur seçim işlemi...");
            }

            
        }

    }
}

