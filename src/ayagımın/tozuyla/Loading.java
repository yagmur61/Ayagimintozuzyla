package ayagımın.tozuyla;

import java.awt.*;
import javax.swing.*;

public class Loading extends JFrame implements Runnable {

    JProgressBar p;
    Thread t;
    String KullaniciAdi;

    public void run() {
        try {
            for (int i = 1; i <= 101; i++) {
                int m = p.getMaximum(); //100
                int n = p.getValue(); //33
                if (n < m) {   //33 <100
                    p.setValue(p.getValue() + 1); //34
                } else {
                    i = 101;
                    setVisible(false);
                    new GöstergePaneli(KullaniciAdi).setVisible(true);
                }
                Thread.sleep(50);
            }
        } catch (Exception e) {
        }
    }

 Loading(String KullaniciAdi) {
        this.KullaniciAdi = KullaniciAdi;

        t = new Thread(this);

        setLayout(null);
        getContentPane().setBackground(Color.GRAY);
        setBounds(500, 200, 900, 529);

        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("ayagımın/tozuyla/icons/loading.jpg"));
        JLabel Il = new JLabel(il);
        Il.setBounds(0, 0, 1000, 468);
        add(Il);

        p = new JProgressBar();
        p.setStringPainted(true);
        p.setBounds(0, 468, 1000, 15);
        add(p);

        t.start();
    }

    public static void main(String[] args) {
        new Loading("").setVisible(true);
    }

}
