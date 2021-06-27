package ayagımın.tozuyla;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class ProfilGüncelle extends JFrame implements ActionListener {

    JTextField t1, t2, t3, t4, t5, t6, t7, t9;
    JButton b1, b2;
    JRadioButton r1, r2;

    ProfilGüncelle(String KullaniciAdi) {
        setLayout(null);
        setBounds(600, 220, 1000, 700);
        getContentPane().setBackground(Color.WHITE);

        JLabel I11 = new JLabel("Profil Güncelle");
        I11.setBounds(230, 0, 380, 40);
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

        t6 = new JTextField();
        t6.setBounds(200, 300, 200, 30);
        add(t6);

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

        b1 = new JButton("GÜNCELLE");
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

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ayagımın/tozuyla/icons/u.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Il0 = new JLabel(i3);
        Il0.setBounds(0, 0, 1000, 700);
        add(Il0);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from musteri where KullaniciAdi = '" + KullaniciAdi + "'");

            while (rs.next()) {
                t1.setText(rs.getString("tc"));
                t2.setText(rs.getString("Adiniz"));
                t3.setText(rs.getString("Soyadiniz"));
                t4.setText(rs.getString("tel"));
                t5.setText(rs.getString("email"));
                t6.setText(rs.getString("cinsiyet"));
                t7.setText(rs.getString("adres"));
                t9.setText(rs.getString("KullaniciAdi"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {
            String tc = t1.getText();
            String Adiniz = t2.getText();
            String Soyadiniz = t3.getText();
            String tel = t4.getText();
            String email = t5.getText();
            String radio = t6.getText();
            String adres = t7.getText();
            String KullaniciAdi = t9.getText();

            String q = " update musteri set tc='" + tc + "', Adiniz='" + Adiniz + "', Soyadiniz='" + Soyadiniz + "', tel='" + tel + "', email='" + email + "',cinsiyet='" + radio + "',adres='" + adres + "',KullaniciAdi='" + KullaniciAdi + "'";
            try {
                Conn c = new Conn();
                c.s.executeUpdate(q);

                JOptionPane.showMessageDialog(null, "Profil Güncelleme Başarılı");
                this.setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();

            }
        } else if (ae.getSource() == b2) {
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {
        new ProfilGüncelle("").setVisible(true);
    }

}
