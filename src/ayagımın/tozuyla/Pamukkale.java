package ayagımın.tozuyla;

import java.awt.*;
import javax.swing.*;


public class  Pamukkale  extends JFrame {
    String s;

  Pamukkale () {
       setLayout(null);
        setBounds(670, 190, 1000, 700);
        getContentPane().setBackground(Color.WHITE);

        JLabel I11 = new JLabel("Pamukkale Turu");
        I11.setBounds(380, 0, 380, 40);
        I11.setFont((new Font("Tahoma", Font.PLAIN, 24)));
        I11.setForeground(Color.DARK_GRAY);
        add(I11);

        JLabel I1 = new JLabel("Kalkış Noktası :");
        I1.setBounds(30, 60, 200, 30);
        add(I1);

        JLabel I12 = new JLabel("Ankara Kızılay Avm Önü");
        I12.setBounds(200, 60, 200, 30);
        I12.setForeground(Color.DARK_GRAY);
        add(I12);

        JLabel I2 = new JLabel("Varış Noktası:");
        I2.setBounds(30, 110, 200, 30);
        add(I2);

        JLabel I13 = new JLabel(" Isparta’nın Kuyucak köyü");
        I13.setBounds(200, 110, 200, 30);
        I13.setForeground(Color.DARK_GRAY);
        add(I13);

        JLabel I3 = new JLabel("Kişi Sayısı :");
        I3.setBounds(30, 160, 200, 30);
        add(I3);

        JLabel I14 = new JLabel("19-23");
        I14.setBounds(200, 160, 200, 30);
        I14.setForeground(Color.DARK_GRAY);
        add(I14);

        JLabel I4 = new JLabel("Gezi Süresi :");
        I4.setBounds(30, 210, 200, 30);
        add(I4);

        JLabel I15 = new JLabel(" 3 Gün 4 Gece ");
        I15.setBounds(200, 210, 200, 30);
        I15.setForeground(Color.darkGray);
        add(I15);

        JLabel I5 = new JLabel("Kalkış Tarihi ve Saati :");
        I5.setBounds(30, 260, 200, 30);
        add(I5);

        JLabel I16 = new JLabel(" 05.08.22 -- 00.00 ");
        I16.setBounds(200, 260, 200, 30);
        I16.setForeground(Color.DARK_GRAY);
        add(I16);

        JLabel I6 = new JLabel("Ücret :");
        I6.setBounds(30, 310, 200, 30);
        add(I6);

        JLabel I17 = new JLabel(" 999 TL (Türk Lirası)");
        I17.setBounds(200, 310, 200, 30);
        I17.setForeground(Color.DARK_GRAY);
        add(I17);

        JLabel I7 = new JLabel("İletişim Bilgileri :");
        I7.setBounds(30, 360, 200, 30);
        add(I7);

        JLabel I18 = new JLabel("0543 247 15 15  ");
        I18.setBounds(200, 360, 200, 30);
        I18.setForeground(Color.DARK_GRAY);
        add(I18);
        JLabel I19 = new JLabel("ayagımıntozu@gmail.com");
        I19.setBounds(200, 380, 200, 30);
        I19.setForeground(Color.DARK_GRAY);
        add(I19);
        
        
        
        
        
        
   
       
        s = "Ayağımın Tozuyla Projesi Hakkında; \n\n\n"
                + "  Ayağımın Tozuyla Projesinin amacı, bir seyahatin süreçlerini ve faaliyetlerini \n otomatikleştiren bir  sistem geliştirmek ve seyahatle ilgili tüm işlemleri gerçekleştirebilecek bir sistem tasarlamaktır. \n \n"
                + "  Bu uygulama, belirli bir varış noktasına seyahat ile ilgili bilgilere büyük bir kolaylıkla \n erişmede yardımcı olacaktır.Kullanıcılar bu uygulama ile turları ile ilgili bilgileri takip edebilirler.\n  \n"
                + " Projenin Avantajları: \n\n"
                + "   *Doğru bilgi verir. \n\n"
                + "   *Manuel çalışmayı basitleştirir.  \n\n"
                + "   *Kullanımı kolay arayüzlere sahiptir.  \n\n"
                + "   *Kişisel bilgilerin güvenilir şekilde saklanması sağlanır.  \n\n"
                + "   *Güncel bilgi sağlar.      \n  \n";

        TextArea t10 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t10.setEditable(false);
        t10.setBounds(440, 60, 490, 550);
        add(t10);
 
        
   /*       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ayagımın/tozuyla/icons/karadeniztur.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel I21 = new JLabel(i3);
        I21.setBounds(0, 70, 1000, 700);
        add(I21);
      */
    }

    public static void main(String[] args) {
        new  Pamukkale().setVisible(true);
    }

}


  
