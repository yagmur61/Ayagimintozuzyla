package ayagımın.tozuyla;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class ProfilBilgileri extends JFrame implements ActionListener {

    JButton b2;

    ProfilBilgileri(String KullaniciAdi) {
        setLayout(null);
        setBounds(600, 220, 1000, 700);
        getContentPane().setBackground(Color.WHITE);

        JLabel I1 = new JLabel("T.C. Numarası  :");
        I1.setBounds(50, 50, 200, 30);
        add(I1);

        JLabel I11 = new JLabel();
        I11.setBounds(220, 50, 200, 30);
        add(I11);

        JLabel I2 = new JLabel("Adınız :");
        I2.setBounds(50, 120, 200, 30);
        add(I2);

        JLabel I12 = new JLabel();
        I12.setBounds(220, 120, 200, 30);
        add(I12);

        JLabel I3 = new JLabel("Soyadınız :");
        I3.setBounds(50, 190, 200, 30);
        add(I3);

        JLabel I13 = new JLabel();
        I13.setBounds(220, 190, 200, 30);
        add(I13);

        JLabel I4 = new JLabel("Telefon Numarası :");
        I4.setBounds(50, 260, 200, 30);
        add(I4);

        JLabel I14 = new JLabel();
        I14.setBounds(220, 260, 200, 30);
        add(I14);

        JLabel I5 = new JLabel("E-mail :");
        I5.setBounds(520, 50, 200, 30);
        add(I5);

        JLabel I15 = new JLabel();
        I15.setBounds(690, 50, 200, 30);
        add(I15);

        JLabel I6 = new JLabel("Cinsiyet :");
        I6.setBounds(520, 120, 200, 30);
        add(I6);

        JLabel I16 = new JLabel();
        I16.setBounds(690, 120, 200, 30);
        add(I16);

        JLabel I7 = new JLabel("Adres :");
        I7.setBounds(520, 190, 200, 30);
        add(I7);

        JLabel I17 = new JLabel();
        I17.setBounds(690, 190, 200, 30);
        add(I17);

        JLabel I9 = new JLabel("Kullanıcı Adı :");
        I9.setBounds(520, 260, 200, 30);
        add(I9);

        JLabel I19 = new JLabel();
        I19.setBounds(690, 260, 200, 30);
        add(I19);

        b2 = new JButton("GERİ");
        b2.setBounds(415, 535, 150, 40);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ayagımın/tozuyla/icons/l.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Il0 = new JLabel(i3);
        Il0.setBounds(0, 70, 1000, 700);
        add(Il0);

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
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b2) {
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new ProfilBilgileri("").setVisible(true);
    }

}
