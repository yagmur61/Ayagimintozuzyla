package ayagımın.tozuyla;

import java.awt.Image;
import javax.swing.*;

public class Fotograflar extends JFrame implements Runnable {

    Thread t1;
    JLabel I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11;
    JLabel[] label = new JLabel[]{I1, I2, I3, I4, I5, I6, I7, I8, I9, I10, I11};

    public void run() {

        try {
            for (int i = 0; i <= 9; i++) {
                this.label[i].setVisible(true);
                Thread.sleep(1500);
                this.label[i].setVisible(false);

            }
        } catch (Exception e) {

        }
    }

    Fotograflar() {
        setBounds(650, 240, 900, 700);

        ImageIcon i1 = null, i2 = null, i3 = null, i4 = null, i5 = null, i6 = null, i7 = null, i8 = null, i9 = null, i10 = null,i11 = null;
        ImageIcon[] image = new ImageIcon[]{i1, i2, i3, i4, i5, i6, i7, i8, i9, i10,i11};

        Image j1 = null, j2 = null, j3 = null, j4 = null, j5 = null, j6 = null, j7 = null, j8 = null, j9 = null, j10 = null, j11 = null;
        Image[] jimage = new Image[]{j1, j2, j3, j4, j5, j6, j7, j8, j9, j10,j11};

        ImageIcon i12 = null, i13 = null, i14 = null, i15 = null, i16 = null, i17 = null, i18 = null, i19 = null, i20 = null, i21 = null, i22 = null;
        ImageIcon[] iimage = new ImageIcon[]{i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22};

        for (int i = 0; i <= 10; i++) {

            image[i] = new ImageIcon(ClassLoader.getSystemResource("ayagımın/tozuyla/icons/k" + (i + 1) + ".jpg"));
            jimage[i] = image[i].getImage().getScaledInstance(900, 700, Image.SCALE_DEFAULT);
            iimage[i] = new ImageIcon(jimage[i]);
            this.label[i] = new JLabel(iimage[i]);
            this.label[i].setBounds(0, 0, 900, 700);
            add(this.label[i]);
        }

        t1 = new Thread(this);
        t1.start();
    }

    public static void main(String[] args) {
        new Fotograflar().setVisible(true);
    }

}
