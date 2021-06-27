package ayagımın.tozuyla;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Odeme extends JFrame implements ActionListener {
    
    JButton b1, b2;
    
    Odeme() {
        setBounds(650, 240, 800, 600);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("ayagımın/tozuyla/icons/odeme.png"));
        Image i2 = il.getImage().getScaledInstance(640,480, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Il = new JLabel(i3);
        Il.setBounds(65, 75, 640,480);
        add(Il);
        
        b1 = new JButton("ÖDEME");
        b1.setBounds(420, 0, 80, 40);
         b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        Il.add(b1);
        
        b2 = new JButton("GERİ");
        b2.setBounds(520, 0, 80, 40);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        Il.add(b2);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            this.setVisible(false);
            new OdemeEkrani().setVisible(true);
        } else if (ae.getSource() == b2) {
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Odeme().setVisible(true);
    }
    
}
