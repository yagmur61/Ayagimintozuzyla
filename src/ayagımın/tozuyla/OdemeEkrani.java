package ayagımın.tozuyla;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.border.LineBorder;

public class OdemeEkrani extends JFrame implements ActionListener {

    JButton b1, b2, b3;
    JTextField t1, t2, t3, t4, t5, t6;

    OdemeEkrani() {

        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds(500, 220, 950, 650);

        JPanel p1 = new JPanel();
        p1.setBackground(new Color(255, 255, 255));
        p1.setBounds(0, 140, 400, 400);
        add(p1);
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("ayagımın/tozuyla/icons/odemeekrani.jpg"));
        JLabel Il = new JLabel(il);
        Il.setBounds(100, 120, 200, 00);

        p1.add(Il);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400, 30, 500, 520);
        add(p2);

        JLabel I2 = new JLabel("Ödeme Şeklini Seçiniz : ");
        I2.setBounds(15, 25, 240, 35);
        I2.setFont(new Font("SAN_SERIF", Font.PLAIN, 22));
        p2.add(I2);

        Choice c1 = new Choice();
        c1.add("Kredi Kartı  ");
        c1.add("Banka Kartı ");
        c1.add("Paypal Kartı ");

        c1.setBounds(255, 32, 240, 50);
        p2.add(c1);

        JLabel I3 = new JLabel("Kart Numarası : ");
        I3.setBounds(15, 80, 170, 25);
        I3.setFont(new Font("SAN_SERIF", Font.PLAIN, 22));
        p2.add(I3);

        t1 = new JTextField();
        t1.setBounds(180, 80, 75, 27);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t1);

        t2 = new JTextField();
        t2.setBounds(260, 80, 75, 27);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t2);

        t3 = new JTextField();
        t3.setBounds(340, 80, 75, 27);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t3);

        t4 = new JTextField();
        t4.setBounds(420, 80, 75, 27);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t4);

        JLabel I4 = new JLabel("Son Kullanma Tarihi : ");
        I4.setBounds(15, 135, 230, 25);
        I4.setFont(new Font("SAN_SERIF", Font.PLAIN, 22));
        p2.add(I4);

        Choice c2 = new Choice();
        c2.add("01");
        c2.add("02");
        c2.add("03");
        c2.add("04");
        c2.add("05");
        c2.add("06");
        c2.add("07");
        c2.add("08");
        c2.add("09");
        c2.add("10");
        c2.add("11");
        c2.add("12");

        c2.setBounds(250, 137, 70, 50);
        p2.add(c2);

        Choice c3 = new Choice();
        c3.add("2022");
        c3.add("2023");
        c3.add("2024");
        c3.add("2025");
        c3.add("2026");
        c3.add("2027");
        c3.add("2028");
        c3.add("2029");

        c3.setBounds(350, 137, 70, 50);
        p2.add(c3);

        JLabel I5 = new JLabel("CVC2 : ");
        I5.setBounds(15, 190, 80, 25);
        I5.setFont(new Font("SAN_SERIF", Font.PLAIN, 21));
        p2.add(I5);

        t5 = new JTextField();
        t5.setBounds(100, 190, 75, 27);
        t5.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t5);

        JLabel I6 = new JLabel("Kart Üzerindeki İsim :");
        I6.setBounds(15, 245, 200, 30);
        I6.setFont(new Font("SAN_SERIF", Font.PLAIN, 21));
        p2.add(I6);

        t6 = new JTextField();
        t6.setBounds(230, 245, 250, 27);
        t6.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t6);

        JLabel I7 = new JLabel("Tur Seçiniz :");
        I7.setFont(new Font("SAN_SERIF", Font.PLAIN, 21));
        I7.setBounds(15, 300, 130, 30);
        p2.add(I7);

        Choice c4 = new Choice();
        c4.add("Doğu Karadeniz Turu - 1459 TL");
        c4.add("Kapadokya - 779 TL");
        c4.add("Pamukkale - 999 TL");
        c4.add("Amasya - 249 TL ");
        c4.add("Nemrut - 689 TL");
        c4.setBounds(150, 305, 240, 50);
        p2.add(c4);

        b1 = new JButton("ÖDE");
        b1.setBounds(170, 390, 150, 40);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        p2.add(b1);

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == b1) {

            JOptionPane.showMessageDialog(null, "Ödeme Başarıyla Gerçekleşmiştir. ");
            this.setVisible(false);
        }

    }

    public static void main(String[] args) {
        new OdemeEkrani().setVisible(true);

    }
}
