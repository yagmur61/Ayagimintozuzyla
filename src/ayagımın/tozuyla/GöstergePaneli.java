package ayagımın.tozuyla;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GöstergePaneli extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10;
    String KullaniciAdi;

    GöstergePaneli(String KullaniciAdi) {
        this.KullaniciAdi = KullaniciAdi;

        setLayout(null);
        setBackground(new Color(0, 0, 0));
        setBounds(200, 100, 1500, 845);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 1500, 65);
        p1.setBackground(new Color(0, 0, 0));
        add(p1);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("ayagımın/tozuyla/icons/g.png"));
        Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel I2 = new JLabel(i6);
        I2.setBounds(5, 0, 70, 70);
        p1.add(I2);

        JLabel I3 = new JLabel("Ayağımın Tozuyla");
        I3.setFont(new Font("Thoma", Font.PLAIN, 25));
        I3.setForeground(Color.WHITE);
        I3.setBounds(80, 10, 300, 40);
        p1.add(I3);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0, 65, 300, 1000);
        p2.setBackground(new Color(0, 0, 0));
        add(p2);

        b1 = new JButton("Profil Ekle");
        b1.setBackground(Color.BLACK);
        b1.setFont(new Font("Thoma", Font.PLAIN, 20));
        b1.setForeground(Color.WHITE);
        b1.setBounds(0, 10, 300, 50);
        b1.addActionListener(this);
        p2.add(b1);

        b2 = new JButton(" Profili Düzenle");
        b2.setBackground(Color.BLACK);
        b2.setFont(new Font("Thoma", Font.PLAIN, 20));
        b2.setForeground(Color.WHITE);
        b2.setBounds(0, 80, 300, 50);
        b2.addActionListener(this);
        p2.add(b2);

        b3 = new JButton(" Profil Bilgileri");
        b3.setBackground(Color.BLACK);
        b3.setFont(new Font("Thoma", Font.PLAIN, 20));
        b3.setForeground(Color.WHITE);
        b3.setBounds(0, 150, 300, 50);
        b3.addActionListener(this);
        p2.add(b3);

        b4 = new JButton("Profil Silme ");
        b4.setBackground(Color.BLACK);
        b4.setFont(new Font("Thoma", Font.PLAIN, 20));
        b4.setForeground(Color.WHITE);
        b4.setBounds(0, 220, 300, 50);
        b4.addActionListener(this);
        p2.add(b4);

        b5 = new JButton("Turlar ");
        b5.setBackground(Color.BLACK);
        b5.setFont(new Font("Thoma", Font.PLAIN, 20));
        b5.setForeground(Color.WHITE);
        b5.setBounds(0, 290, 300, 50);
        b5.addActionListener(this);
        p2.add(b5);

        b6 = new JButton("Tur Detayları");
        b6.setBackground(Color.BLACK);
        b6.setFont(new Font("Thoma", Font.PLAIN, 20));
        b6.setForeground(Color.WHITE);
        b6.setBounds(0, 360, 300, 50);
        b6.addActionListener(this);
        p2.add(b6);

        b7 = new JButton("Fotoğraflar");
        b7.setBackground(Color.BLACK);
        b7.setFont(new Font("Thoma", Font.PLAIN, 20));
        b7.setForeground(Color.WHITE);
        b7.setBounds(0, 430, 300, 50);
        b7.addActionListener(this);
        p2.add(b7);

        b8 = new JButton("Ödeme ");
        b8.setBackground(Color.BLACK);
        b8.setFont(new Font("Thoma", Font.PLAIN, 20));
        b8.setForeground(Color.WHITE);
        b8.addActionListener(this);
        b8.setBounds(0, 500, 300, 50);
        p2.add(b8);

        b10 = new JButton("Hesap Makinesi");
        b10.setBackground(Color.BLACK);
        b10.setFont(new Font("Thoma", Font.PLAIN, 20));
        b10.setForeground(Color.WHITE);
        b10.setBounds(0, 570, 300, 50);
        b10.addActionListener(this);
        p2.add(b10);

        b9 = new JButton("Hakkımızda");
        b9.setBackground(Color.BLACK);
        b9.setFont(new Font("Thoma", Font.PLAIN, 20));
        b9.setForeground(Color.WHITE);
        b9.setBounds(0, 640, 300, 50);
        b9.addActionListener(this);
        p2.add(b9);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ayagımın/tozuyla/icons/gezii.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Il = new JLabel(i3);
        Il.setBounds(300, 0, 1200, 800);
        add(Il);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            new ProfilEkle(KullaniciAdi).setVisible(true);
        } else if (ae.getSource() == b2) {
            new ProfilGüncelle(KullaniciAdi).setVisible(true);
        } else if (ae.getSource() == b3) {
            new ProfilBilgileri(KullaniciAdi).setVisible(true);
        } else if (ae.getSource() == b5) {
            new Turlar().setVisible(true);
        } else if (ae.getSource() == b7) {
            new Fotograflar().setVisible(true);
        } else if (ae.getSource() == b8) {
            new Odeme().setVisible(true);
        } else if (ae.getSource() == b9) {
            new Hakkimizda().setVisible(true);
        } else if (ae.getSource() == b4) {
            new ProfilSilme(KullaniciAdi).setVisible(true);
        } else if (ae.getSource() == b6) {
            new TurDetaylari().setVisible(true);
        }else if (ae.getSource() == b10) {
          try{
              Runtime.getRuntime().exec("calc.exe");
          }catch (Exception e){}
    }
    }

    public static void main(String[] args) {
        new GöstergePaneli("").setVisible(true);
    }

}
