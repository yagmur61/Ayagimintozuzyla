package ayagımın.tozuyla;

import javax.swing.*;
import java.awt.*;

public class Splash {

    public static void main(String[] args) {
        SplashFrame frame = new SplashFrame();
        frame.setVisible(true);
        int x = 1;

        for (int i = 1; i <= 700; i += 45, x += 9) {

            frame.setLocation(950 - (x + i) / 2, 500 - (i / 2));
            frame.setSize(x + i, i);
            try {
                Thread.sleep(10);

            } catch (Exception e) {
            }

        }
        frame.setVisible(true);
    }

}

class SplashFrame extends JFrame implements Runnable {

    Thread t1;

    SplashFrame() {
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("ayagımın/tozuyla/icons/1.jpeg"));
        Image i2 = il.getImage().getScaledInstance(960, 640, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel Il = new JLabel(i3);
        add(Il);

        //  setBounds(300,100,1000,800);
        // setUndecorated(true);
        t1 = new Thread(this);
        t1.start();
    }

    public void run() {

        try {
            Thread.sleep(2000);
             this.setVisible(false);

            new LoginPage().setVisible(true);
        } catch (Exception e) {

        }

    }
}
