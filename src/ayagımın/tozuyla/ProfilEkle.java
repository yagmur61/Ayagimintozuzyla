package ayagımın.tozuyla;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class ProfilEkle extends JFrame implements ActionListener {

    JTextField t1, t2, t3, t4, t5, t7, t9;
    JButton b1, b2;
    JRadioButton r1, r2;

    ProfilEkle(String KullaniciAdi) {
        setLayout(null);
        setBounds(600, 220, 1000, 700);
        getContentPane().setBackground(Color.WHITE);

        JLabel I11 = new JLabel("Profil Ekle");
        I11.setBounds(255, 0, 380, 40);
        I11.setFont((new Font("Tahoma", Font.PLAIN, 20)));
        add(I11);

        JLabel I1 = new JLabel("T.C. Numarası  :");
        I1.setBounds(30, 50, 200, 30);
        add(I1);

        t1 = new JTextField();
        t1.setBounds(200, 50, 200, 30);
        add(t1);

        JLabel I2 = new JLabel("Adınız :");
        I2.setBounds(30, 100, 200, 30);
        add(I2);

        t2 = new JTextField();
        t2.setBounds(200, 100, 200, 30);
        add(t2);

        JLabel I3 = new JLabel("Soyadınız :");
        I3.setBounds(30, 150, 200, 30);
        add(I3);

        t3 = new JTextField();
        t3.setBounds(200, 150, 200, 30);
        add(t3);

        JLabel I4 = new JLabel("Telefon Numarası :");
        I4.setBounds(30, 200, 200, 30);
        add(I4);

        t4 = new JTextField();
        t4.setBounds(200, 200, 200, 30);
        add(t4);

        JLabel I5 = new JLabel("E-mail :");
        I5.setBounds(30, 250, 200, 30);
        add(I5);

        t5 = new JTextField();
        t5.setBounds(200, 250, 200, 30);
        add(t5);

        JLabel I6 = new JLabel("Cinsiyet :");
        I6.setBounds(30, 300, 200, 30);
        add(I6);

        r1 = new JRadioButton("Kadın");
        r1.setBackground(Color.WHITE);
        r1.setBounds(200, 300, 70, 30);
        add(r1);

        r2 = new JRadioButton("Erkek");
        r2.setBackground(Color.WHITE);
        r2.setBounds(300, 300, 70, 30);
        add(r2);

        JLabel I7 = new JLabel("Adres :");
        I7.setBounds(30, 350, 200, 30);
        add(I7);

        t7 = new JTextField();
        t7.setBounds(200, 350, 200, 80);
        add(t7);

        JLabel I9 = new JLabel("Kullanıcı Adı :");
        I9.setBounds(30, 460, 200, 30);
        add(I9);

        t9 = new JTextField();
        t9.setBounds(200, 460, 200, 30);
        add(t9);

        b1 = new JButton("EKLE");
        b1.setBounds(70, 560, 150, 40);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("GERİ");
        b2.setBounds(280, 560, 150, 40);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ayagımın/tozuyla/icons/o.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Il0 = new JLabel(i3);
        Il0.setBounds(0, 0, 1000, 700);
        add(Il0);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from account where  KullaniciAdi = '" + KullaniciAdi + "'");

            while(rs.next()) {
                t9.setText(rs.getString("KullaniciAdi"));
                t2.setText(rs.getString("Adiniz"));
                t3.setText(rs.getString("Soyadiniz"));
            }

        } catch (Exception e) {

        }

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {
            String tc = t1.getText();
            String Adiniz = t2.getText();
            String Soyadiniz = t3.getText();
            String tel = t4.getText();
            String email = t5.getText();
            String radio = null;
            if (r1.isSelected()) {
                radio = "Kadın";

            } else if (r2.isSelected()) {
                radio = "Erkek";
            }
            String adres = t7.getText();
            String KullaniciAdi = t9.getText();

            String q = "insert into musteri values('" + tc + "','" + Adiniz + "','" + Soyadiniz + "','" + tel + "','" + email + "','" + radio + "','" + adres + "','" + KullaniciAdi + "')";
          
            try {
                Conn c = new Conn();
                c.s.executeUpdate(q);

                JOptionPane.showMessageDialog(null, "Profil Ekleme Başarılı");
                this.setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();

            }
        } else if (ae.getSource() == b2) {
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new ProfilEkle("").setVisible(true);
    }

}
