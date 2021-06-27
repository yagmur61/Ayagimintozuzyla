package ayagımın.tozuyla;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class SifremiUnuttum extends JFrame implements ActionListener {

    JTextField t1, t2, t3, t4;
    JButton b1, b2, b3;

    SifremiUnuttum() {
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds(500, 300, 900, 450);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(255, 255, 255));
        p1.setBounds(0, 100, 300, 300);
        add(p1);
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("ayagımın/tozuyla/icons/sifremiunuttum.jpg"));
        JLabel Il = new JLabel(il);
        Il.setBounds(100, 120, 200, 00);
        p1.add(Il);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(300, 30, 550, 350);
        add(p2);

        JLabel I1 = new JLabel("Kullanıcı Adınız : ");
        I1.setBounds(50, 20, 200, 25);
        I1.setFont(new Font("SAN_SERIF", Font.PLAIN, 21));
        p2.add(I1);

        t1 = new JTextField();
        t1.setBounds(210, 20, 250, 30);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t1);

        b1 = new JButton("ARA");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(470, 20, 70, 30);
        b1.addActionListener(this);
        p2.add(b1);

        JLabel I2 = new JLabel("Adınız : ");
        I2.setBounds(50, 70, 250, 25);
        I2.setFont(new Font("SAN_SERIF", Font.PLAIN, 21));
        p2.add(I2);

        t2 = new JTextField();
        t2.setBounds(210, 70, 250, 30);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t2);

        JLabel I3 = new JLabel("E-mail : ");
        I3.setBounds(50, 120, 200, 25);
        I3.setFont(new Font("SAN_SERIF", Font.PLAIN, 21));
        p2.add(I3);

        t3 = new JTextField();
        t3.setBounds(210, 120, 250, 30);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t3);

        b2 = new JButton("ARA");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(470, 120, 70, 30);
         b2.addActionListener(this);
        p2.add(b2);

        JLabel I4 = new JLabel("Şifreniz : ");
        I4.setBounds(50, 170, 250, 25);
        I4.setFont(new Font("SAN_SERIF", Font.PLAIN, 21));
        p2.add(I4);

        t4 = new JTextField();
        t4.setBounds(210, 170, 250, 30);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t4);

        b3 = new JButton("GERİ ");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(220, 250, 150, 40);
        b3.addActionListener(this);
        p2.add(b3);

    }

    public void actionPerformed(ActionEvent ae) {

        Conn c = new Conn();

        if (ae.getSource() == b1) {
            try {
                String sql = "select * from account where KullaniciAdi = '" + t1.getText() + "'";
                ResultSet rs = c.s.executeQuery(sql);
                while (rs.next()) {
                    t2.setText(rs.getString("Adiniz"));

                }

            } catch (Exception e) {
            }
        } else if (ae.getSource() == b2) {
            
            try {
                String sql = "select * from account where Email = '" + t3.getText() + "' AND KullaniciAdi = '" + t1.getText() + "'";
                ResultSet rs = c.s.executeQuery(sql);
                while (rs.next()) {
                    t4.setText(rs.getString("KullaniciSifre"));

                }

            } catch (Exception e) {
            }

        } else if (ae.getSource() == b3) {
            this.setVisible(false);
            new LoginPage().setVisible(true);
        }

    }

    public static void main(String[] args) {
        new SifremiUnuttum().setVisible(true);
    }
}
