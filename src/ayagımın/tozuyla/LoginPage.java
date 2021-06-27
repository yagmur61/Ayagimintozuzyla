package ayagımın.tozuyla;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;

public class LoginPage extends JFrame implements ActionListener {
    
    JButton b1, b2, b3;
    JTextField t1;
    JPasswordField t2;
    
    LoginPage() {
       

        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setBounds(500, 300, 900, 500);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(255, 255, 255));
        p1.setBounds(0, 100, 400, 400);
        add(p1);
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("ayagımın/tozuyla/icons/login.png"));
        JLabel Il = new JLabel(il);
        Il.setBounds(100, 120, 200, 00);
        p1.add(Il);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400, 30, 450, 400);
        add(p2);
        
        JLabel I2 = new JLabel("Kullanıcı Adı ");
        I2.setBounds(60, 20, 200, 25);
        I2.setFont(new Font("SAN_SERIF", Font.PLAIN, 25));
        p2.add(I2);
        
        t1 = new JTextField();
        t1.setBounds(60, 60, 300, 35);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t1);
        
        JLabel I3 = new JLabel("Kullanıcı Şifre ");
        I3.setBounds(60, 110, 200, 25);
        I3.setFont(new Font("SAN_SERIF", Font.PLAIN, 25));
        p2.add(I3);
        
        t2 = new JPasswordField();
        t2.setBounds(60, 150, 300, 35);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p2.add(t2);
        
        b1 = new JButton("GİRİŞ");
        b1.setBounds(60, 230, 150, 40);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBorder(BorderFactory.createEmptyBorder());
        b1.addActionListener(this);
        p2.add(b1);
        
        b2 = new JButton("KAYDOL");
        b2.setBounds(240, 230, 150, 40);
        b2.setBackground(Color.WHITE);
        b2.setForeground(Color.BLACK);
        b2.setBorder(new LineBorder(Color.BLACK));
        b2.addActionListener(this);
        p2.add(b2);
        
        b3 = new JButton("ŞİFREMİ UNUTTUM!");
        b3.setBounds(140, 300, 170, 40);
        b3.setBackground(Color.WHITE);
        b3.setForeground(Color.BLACK);
        b3.setBorder(new LineBorder(Color.BLACK));
        b3.addActionListener(this);
        p2.add(b3);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        
        if (ae.getSource() == b1) {
            
            try {
                
                String KullaniciAdi = t1.getText();
                String KullaniciSifre = t2.getText();
                String sql = "select * from account where KullaniciAdi='" + KullaniciAdi + "' AND KullaniciSifre= '" + KullaniciSifre + "'";
                Conn c = new Conn();
                ResultSet rs = c.s.executeQuery(sql);
                if (rs.next()) {
                    this.setVisible(false);
                     new Loading(KullaniciAdi).setVisible(true);
                }else {
                    JOptionPane.showMessageDialog(null, "Geçersiz Giriş");
                }
                    
                
            } catch (Exception e) {
            }
            
        } else if (ae.getSource() == b2) {
            this.setVisible(false);
            new Kaydol().setVisible(true);
            
        } else if (ae.getSource() == b3) {
            this.setVisible(false);
            new SifremiUnuttum().setVisible(true);
        }
        
    }
    
    public static void main(String[] args) {
        new LoginPage().setVisible(true);
        
    }
}
