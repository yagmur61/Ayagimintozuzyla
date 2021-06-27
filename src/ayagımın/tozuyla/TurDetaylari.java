package ayagımın.tozuyla;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TurDetaylari extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;

    TurDetaylari() {

        setLayout(null);
        setBackground(new Color(0, 0, 0));
        setBounds(470, 140, 1200, 750);

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

        JLabel I3 = new JLabel("Bu Ayın Turları...");
        I3.setFont(new Font("Thoma", Font.PLAIN, 25));
        I3.setForeground(Color.WHITE);
        I3.setBounds(80, 10, 300, 40);
        p1.add(I3);

        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(0, 65, 300, 1000);
        p2.setBackground(new Color(0, 0, 0));
        add(p2);

        b1 = new JButton("Doğu Karadeniz");
        b1.setBackground(Color.BLACK);
        b1.setFont(new Font("Thoma", Font.PLAIN, 20));
        b1.setForeground(Color.WHITE);
        b1.setBounds(0, 10, 300, 50);
        b1.addActionListener(this);
        p2.add(b1);

        b2 = new JButton(" Kapadokya ");
        b2.setBackground(Color.BLACK);
        b2.setFont(new Font("Thoma", Font.PLAIN, 20));
        b2.setForeground(Color.WHITE);
        b2.setBounds(0, 100, 300, 50);
        b2.addActionListener(this);
        p2.add(b2);

        b3 = new JButton(" Pamukkale");
        b3.setBackground(Color.BLACK);
        b3.setFont(new Font("Thoma", Font.PLAIN, 20));
        b3.setForeground(Color.WHITE);
        b3.setBounds(0, 190, 300, 50);
        b3.addActionListener(this);
        p2.add(b3);

        b4 = new JButton("Amasya ");
        b4.setBackground(Color.BLACK);
        b4.setFont(new Font("Thoma", Font.PLAIN, 20));
        b4.setForeground(Color.WHITE);
        b4.setBounds(0, 280, 300, 50);
        b4.addActionListener(this);
        p2.add(b4);

        b5 = new JButton("Nemrut ");
        b5.setBackground(Color.BLACK);
        b5.setFont(new Font("Thoma", Font.PLAIN, 20));
        b5.setForeground(Color.WHITE);
        b5.setBounds(0, 370, 300, 50);
        b5.addActionListener(this);
        p2.add(b5);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ayagımın/tozuyla/icons/turdetay.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Il = new JLabel(i3);
        Il.setBounds(300, 0, 1000, 800);
        add(Il);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            new Karadeniz().setVisible(true);

        } else if (ae.getSource() == b2) {
            new Kapadokya().setVisible(true);
        } else if (ae.getSource() == b4) {
            new Amasya().setVisible(true);
        } else if (ae.getSource() == b3) {
            new Pamukkale().setVisible(true);
        } else if (ae.getSource() == b5) {
            new Nemrut().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new TurDetaylari().setVisible(true);
    }

}
