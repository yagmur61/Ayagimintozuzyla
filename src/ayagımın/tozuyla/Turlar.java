package ayagımın.tozuyla;

import java.awt.*;
import javax.swing.*;

public class Turlar extends JFrame {

    Turlar() {
        setBounds(600, 220, 1000, 700);

        String[] package1 = new String[]{"Doğu Karadeniz Turu", "Ücrete Dahil Olan Hizmetler ", "4 Gün 5 Gece ", "*5 Gece Pansiyon Konaklama", "*Programda Belirtilen Tüm Çevre Gezileri", "*Açık Büfe 4 Sabah Kahvaltısı", "*Açık Büfe 5 Akşam Yemeği ", "*Araç İçi İkramlar", "*Milli Park Giriş Ücretleri", "Ücrete Dahil Olmayan Hizmetler","*Tüm Öğle Yemekleri","*Kişisel Harcamalar ve Ekstra Hizmetler","*Müze ve Ören Yeri Giriş Ücretleri","*Ekstra Aktivitelere Katılım Ücretleri","YALNIZCA 1459 ₺", "karadeniz.jpg"};
        String[] package2 = new String[]{"Kapadokya Turu", "Ücrete Dahil Olan Hizmetler", "2 Gün 1 Gece", "*1 Gece Pansiyon Konaklama", "*Programda Belirtilen Tüm Çevre Gezileri", "*Açık Büfe 2 Sabah Kahvaltısı", "*Açık Büfe 1 Akşam Yemeği ", "*Araç İçi İkramlar", "*Milli Park Giriş Ücretleri", "Ücrete Dahil Olmayan Hizmetler", "*Tüm Öğle Yemekleri","*Kişisel Harcamalar ve Ekstra Hizmetler","*Müze ve Ören Yeri Giriş Ücretleri","*Ekstra Aktivitelere Katılım Ücretleri","YALNIZCA 379₺","kapadokya.png"};
        String[] package3 = new String[]{"Pamukkale Turu", "Ücrete Dahil Olan Hizmetler", "3 Gün 4 Gece", "*4 Gece Pansiyon Konaklama", "*Programda Belirtilen Tüm Çevre Gezileri", "*Açık Büfe 3 Sabah Kahvaltısı", "*Açık Büfe 4 Akşam Yemeği ", "*Araç İçi İkramlar", "*Milli Park Giriş Ücretleri", "Ücrete Dahil Olmayan Hizmetler","*Tüm Öğle Yemekleri","*Kişisel Harcamalar ve Ekstra Hizmetler","*Müze ve Ören Yeri Giriş Ücretleri","*Ekstra Aktivitelere Katılım Ücretleri","YALNIZCA 999 ₺", "pamukkale_2.jpg"};
        String[] package4 = new String[]{"Amasya Turu", "Ücrete Dahil Olan Hizmetler", "Günübirlik", "*Yarım Pansiyon Konaklama", "*Programda Belirtilen Tüm Çevre Gezileri", "*Açık Büfe Sabah Kahvaltısı", "*Açık Büfe Akşam Yemeği ", "*Araç İçi İkramlar", "*Milli Park Giriş Ücretleri", "Ücrete Dahil Olmayan Hizmetler","*Tüm Öğle Yemekleri","*Kişisel Harcamalar ve Ekstra Hizmetler","*Müze ve Ören Yeri Giriş Ücretleri","*Ekstra Aktivitelere Katılım Ücretleri","YALNIZCA 249 ₺", "odunpazarı.jpg"};
        String[] package5 = new String[]{"Nemrut Dağı Turu", "Ücrete Dahil Olan Hizmetler", "2 Gün 1 Gece", "*1 Gece Pansiyon Konaklama", "*Programda Belirtilen Tüm Çevre Gezileri", "*Açık Büfe 2 Sabah Kahvaltısı", "*Açık Büfe 1 Akşam Yemeği ", "*Araç İçi İkramlar", "*Milli Park Giriş Ücretleri", "Ücrete Dahil Olmayan Hizmetler", "*Tüm Öğle Yemekleri","*Kişisel Harcamalar ve Ekstra Hizmetler","*Müze ve Ören Yeri Giriş Ücretleri","*Ekstra Aktivitelere Katılım Ücretleri","YALNIZCA 689 ₺","nemrut.jpg"};

        JTabbedPane pane = new JTabbedPane();
        JPanel p1 = createPackage(package1);
        pane.addTab("Doğu Karadeniz Turu", null, p1);

        JPanel p2 = createPackage(package2);
        pane.addTab("Kapadokya Turu", null, p2);

        JPanel p3 = createPackage(package3);
        pane.addTab("Pamukkale Turu", null, p3);

        JPanel p4 = createPackage(package4);
        pane.addTab("Amasya Turu ", null, p4);

        JPanel p5 = createPackage(package5);
        pane.addTab("Nemrut Dağı Turu ", null, p5);

        add(pane, BorderLayout.CENTER);

    }

    public JPanel createPackage(String[] pack) {
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);

        JLabel I1 = new JLabel(pack[0]);
        I1.setBounds(365, 5, 300, 90);
        I1.setForeground(Color.RED);
        I1.setFont(new Font("Tahoma", Font.PLAIN, 30));
        p1.add(I1);

        JLabel I2 = new JLabel(pack[1]);
        I2.setBounds(80, 80, 300, 75);
        I2.setForeground(Color.BLACK);
        I2.setFont(new Font("Tahoma", Font.PLAIN, 22));
        p1.add(I2);

        JLabel I3 = new JLabel(pack[2]);
        I3.setBounds(50, 140, 300, 50);
        I3.setForeground(Color.WHITE);
        I3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(I3);

        JLabel I4 = new JLabel(pack[3]);
        I4.setBounds(50, 200, 450, 50);
        I4.setForeground(Color.WHITE);
        I4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(I4);

        JLabel I5 = new JLabel(pack[4]);
        I5.setBounds(50, 260, 450, 50);
        I5.setForeground(Color.WHITE);
        I5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(I5);

        JLabel I6 = new JLabel(pack[5]);
        I6.setBounds(50, 320, 450, 50);
        I6.setForeground(Color.WHITE);
        I6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(I6);

        JLabel I7 = new JLabel(pack[6]);
        I7.setBounds(50, 380, 450, 50);
        I7.setForeground(Color.WHITE);
        I7.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(I7);

        JLabel I8 = new JLabel(pack[7]);
        I8.setBounds(50, 440, 450, 50);
        I8.setForeground(Color.WHITE);
        I8.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(I8);

        JLabel I9 = new JLabel(pack[8]);
        I9.setBounds(50, 500, 450, 50);
        I9.setForeground(Color.WHITE);
        I9.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(I9);

        JLabel I10 = new JLabel(pack[9]);
        I10.setBounds(570, 80, 400, 75);
        I10.setForeground(Color.BLACK);
        I10.setFont(new Font("Tahoma", Font.PLAIN, 22));
        p1.add(I10);

        JLabel I11 = new JLabel(pack[10]);
        I11.setBounds(580, 140, 300, 75);
        I11.setForeground(Color.WHITE);
        I11.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(I11);

        JLabel I12 = new JLabel(pack[11]);
        I12.setBounds(580, 200, 400, 75);
        I12.setForeground(Color.WHITE);
        I12.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(I12);

        JLabel I13 = new JLabel(pack[12]);
        I13.setBounds(580, 260, 300, 75);
        I13.setForeground(Color.WHITE);
        I13.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(I13);

        JLabel I14 = new JLabel(pack[13]);
        I14.setBounds(580, 320, 400, 75);
        I14.setForeground(Color.WHITE);
        I14.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p1.add(I14);

        JLabel I15 = new JLabel(pack[14]);
        I15.setBounds(560, 450, 400, 75);
        I15.setForeground(Color.YELLOW);
        I15.setFont(new Font("Tahoma", Font.PLAIN, 40));
        p1.add(I15);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ayagımın/tozuyla/icons/" + pack[15]));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Il = new JLabel(i3);
        Il.setBounds(0, 0, 1000, 700);
        p1.add(Il);

        return p1;

    }

    public static void main(String[] args) {
        new Turlar().setVisible(true);
    }

}
