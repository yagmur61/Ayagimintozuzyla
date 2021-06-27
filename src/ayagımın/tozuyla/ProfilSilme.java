package ayagımın.tozuyla;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class ProfilSilme extends JFrame implements ActionListener {

    JButton b1, b2;
    String KullaniciAdi;

    ProfilSilme(String KullaniciAdi) {
        this.KullaniciAdi= KullaniciAdi;
        setLayout(null);
        setBounds(600, 220, 1000, 700);
        getContentPane().setBackground(Color.WHITE);

        JLabel heading = new JLabel("Profil Silme");
        heading.setBounds(285, 0, 380, 50);
        heading.setFont((new Font("Tahoma", Font.PLAIN, 30)));
        add(heading);

        JLabel I1 = new JLabel("T.C. Numarası  :");
        I1.setBounds(80, 70, 200, 30);
        add(I1);

        JLabel I11 = new JLabel();
        I11.setBounds(230, 70, 200, 30);
        add(I11);

        JLabel I2 = new JLabel("Adınız :");
        I2.setBounds(80, 140, 200, 30);
        add(I2);

        JLabel I12 = new JLabel();
        I12.setBounds(230, 140, 200, 30);
        add(I12);

        JLabel I3 = new JLabel("Soyadınız :");
        I3.setBounds(80, 210, 200, 30);
        add(I3);

        JLabel I13 = new JLabel();
        I13.setBounds(230, 210, 200, 30);
        add(I13);

        JLabel I4 = new JLabel("Telefon Numarası :");
        I4.setBounds(80, 280, 200, 30);
        add(I4);

        JLabel I14 = new JLabel();
        I14.setBounds(230, 280, 200, 30);
        add(I14);

        JLabel I5 = new JLabel("E-mail :");
        I5.setBounds(550, 70, 200, 30);
        add(I5);

        JLabel I15 = new JLabel();
        I15.setBounds(700, 70, 200, 30);
        add(I15);

        JLabel I6 = new JLabel("Cinsiyet :");
        I6.setBounds(550, 140, 200, 30);
        add(I6);

        JLabel I16 = new JLabel();
        I16.setBounds(700, 140, 200, 30);
        add(I16);

        JLabel I7 = new JLabel("Adres :");
        I7.setBounds(550, 210, 200, 30);
        add(I7);

        JLabel I17 = new JLabel();
        I17.setBounds(700, 210, 200, 30);
        add(I17);

        JLabel I9 = new JLabel("Kullanıcı Adı :");
        I9.setBounds(550, 280, 200, 30);
        add(I9);

        JLabel I19 = new JLabel();
        I19.setBounds(700, 280, 200, 30);
        add(I19);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from musteri where KullaniciAdi = '" + KullaniciAdi + "'");

            while (rs.next()) {
                I11.setText(rs.getString("tc"));
                I12.setText(rs.getString("Adiniz"));
                I13.setText(rs.getString("Soyadiniz"));
                I14.setText(rs.getString("tel"));
                I15.setText(rs.getString("email"));
                I16.setText(rs.getString("cinsiyet"));
                I17.setText(rs.getString("adres"));
                I19.setText(rs.getString("KullaniciAdi"));

            }

        } catch (Exception e) {
        }

        b1 = new JButton(" SİL ");
        b1.setBounds(220, 540, 150, 40);
        b1.setBackground(new Color(238, 238, 238));
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton(" GERİ ");
        b2.setBounds(450, 540, 150, 40);
        b2.setBackground(new Color(238, 238, 238));
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ayagımın/tozuyla/icons/silme.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Il0 = new JLabel(i3);
        Il0.setBounds(0, 0, 1000, 700);
        add(Il0);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {
            try {
                Conn c = new Conn();
                c.s.executeUpdate("delete from account where  KullaniciAdi = '" + KullaniciAdi + "'");
                c.s.executeUpdate("delete from musteri where  KullaniciAdi = '" + KullaniciAdi + "'");

                JOptionPane.showMessageDialog(null, "Profil Silme Başarılı");
                System.exit(0);

            } catch (Exception e) {
            }

        } else if (ae.getSource() == b2) {
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {
        new ProfilSilme("").setVisible(true);
    }

}
