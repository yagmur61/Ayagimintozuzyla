package ayagımın.tozuyla;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Hakkimizda extends JFrame implements ActionListener {

    String s;
    JButton b1;

    Hakkimizda() {

        setBounds(800, 300, 550, 550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel I1 = new JLabel("Ayağımın Tozuyla");
        I1.setBounds(150, 10, 400, 80);
        I1.setForeground(Color.RED);
        I1.setFont(new Font("SAN_SERIF", Font.CENTER_BASELINE, 25));

        s = "Ayağımın Tozuyla Projesi Hakkında; \n\n\n"
                + "  Ayağımın Tozuyla Projesinin amacı, bir seyahatin süreçlerini ve faaliyetlerini \n otomatikleştiren bir  sistem geliştirmek ve seyahatle ilgili tüm işlemleri gerçekleştirebilecek bir sistem tasarlamaktır. \n \n"
                + "  Bu uygulama, belirli bir varış noktasına seyahat ile ilgili bilgilere büyük bir kolaylıkla \n erişmede yardımcı olacaktır.Kullanıcılar bu uygulama ile turları ile ilgili bilgileri takip edebilirler.\n  \n"
                + " Projenin Avantajları: \n\n"
                + "   *Doğru bilgi verir. \n\n"
                + "   *Manuel çalışmayı basitleştirir.  \n\n"
                + "   *Kullanımı kolay arayüzlere sahiptir.  \n\n"
                + "   *Kişisel bilgilerin güvenilir şekilde saklanması sağlanır.  \n\n"  
                + "   *Güncel bilgi sağlar.      \n  \n";

        
         

        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(20, 100, 500, 320);
        add(t1);

        add(I1);

        b1 = new JButton("GERİ");
        b1.setBounds(210, 440, 110, 35);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
    }

    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
    }

    public static void main(String[] args) {
        new Hakkimizda().setVisible(true);

    }
}
