package ayagımın.tozuyla;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Kaydol extends JFrame implements ActionListener {

    JButton b1, b2;
    JTextField t1, t3, t4, t6;
    JPasswordField t5;

    Kaydol() {

        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds(500, 300, 900, 450);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(255, 255, 255));
        p1.setBounds(0, 100, 300, 300);
        add(p1);
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("ayagımın/tozuyla/icons/kaydol.png"));
        JLabel Il = new JLabel(il);
        Il.setBounds(100, 120, 200, 00);
        p1.add(Il);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(300, 30, 550, 350);
        add(p2);

        JLabel I2 = new JLabel("Adınız : ");
        I2.setBounds(60, 20, 200, 25);
        I2.setFont(new Font("SAN_SERIF", Font.PLAIN, 21));
        p2.add(I2);

        t1 = new JTextField();
        t1.setBounds(210, 20, 250, 30);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t1);

        JLabel I3 = new JLabel("Soyadınız : ");
        I3.setBounds(60, 70, 250, 25);
        I3.setFont(new Font("SAN_SERIF", Font.PLAIN, 21));
        p2.add(I3);

        t3 = new JTextField();
        t3.setBounds(210, 70, 250, 30);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t3);

        JLabel I4 = new JLabel("Kullanıcı Adı : ");
        I4.setBounds(60, 120, 200, 25);
        I4.setFont(new Font("SAN_SERIF", Font.PLAIN, 21));
        p2.add(I4);

        t4 = new JTextField();
        t4.setBounds(210, 120, 250, 30);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t4);

        JLabel I5 = new JLabel("Kullanıcı Şifre :");
        I5.setBounds(60, 170, 200, 25);
        I5.setFont(new Font("SAN_SERIF", Font.PLAIN, 21));
        p2.add(I5);

        t5 = new JPasswordField();
        t5.setBounds(210, 170, 250, 30);
        t5.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t5);

        
        JLabel I6 = new JLabel("E-mail :");
        I6.setBounds(60, 223, 200, 25);
        I6.setFont(new Font("SAN_SERIF", Font.PLAIN, 21));
        p2.add(I6);

        t6 = new JTextField();
        t6.setBounds(210, 220, 250, 30);
        t6.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t6);

        b1 = new JButton("KAYDOL");
        b1.setBounds(110, 280, 150, 40);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        b1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(b1);

        b2 = new JButton("GERİ");
        b2.setBounds(300, 280, 150, 40);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        b2.setBorder(new LineBorder(Color.BLACK));
        p2.add(b2);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            String Adiniz = t1.getText();
            String Soyadiniz = t3.getText();
            String KullaniciAdi = t4.getText();
            String KullaniciSifre = t5.getText();
            String Email = t6.getText();

            String query = "insert into account values('" + Adiniz + "','" + Soyadiniz + "','" + KullaniciAdi + "','" + KullaniciSifre + "','" + Email + "') ";
            try {
                Conn c = new Conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Hesap Oluşturma Başarılı");

                this.setVisible(false);
                new LoginPage().setVisible(true);
            } catch (Exception e) {

            }

        } else if (ae.getSource() == b2) {
            new LoginPage().setVisible(true);
            this.setVisible(false);

        }
    }

    public static void main(String[] args) {
        new Kaydol();
    }
}
