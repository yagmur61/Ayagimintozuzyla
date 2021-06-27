package ayagımın.tozuyla;

import java.awt.*;
import javax.swing.*;


public class Karadeniz extends JFrame {

    String s;

    Karadeniz() {
        setLayout(null);
        setBounds(670, 190, 1000, 700);
        getContentPane().setBackground(Color.WHITE);

        JLabel I11 = new JLabel("Doğu Karadeniz Turu");
        I11.setBounds(380, 0, 380, 40);
        I11.setFont((new Font("Tahoma", Font.PLAIN, 24)));
          I11.setForeground(Color.DARK_GRAY);
        add(I11);

        JLabel I1 = new JLabel("Kalkış Noktası :");
        I1.setBounds(30, 60, 200, 30);
        add(I1);

        JLabel I12 = new JLabel("Ankara Kızılay Avm Önü ");
        I12.setBounds(200, 60, 200, 30);
        I12.setForeground(Color.DARK_GRAY);
        add(I12);

        JLabel I2 = new JLabel("Varış Noktası:");
        I2.setBounds(30, 110, 200, 30);
        add(I2);

        JLabel I13 = new JLabel("Trabzon Meydan ");
        I13.setBounds(200, 110, 200, 30);
        I13.setForeground(Color.DARK_GRAY);
        add(I13);

        JLabel I3 = new JLabel("Kişi Sayısı :");
        I3.setBounds(30, 160, 200, 30);
        add(I3);

        JLabel I14 = new JLabel("22-28  ");
        I14.setBounds(200, 160, 200, 30);
        I14.setForeground(Color.DARK_GRAY);
        add(I14);

        JLabel I4 = new JLabel("Gezi Süresi :");
        I4.setBounds(30, 210, 200, 30);
        add(I4);

         JLabel I15 = new JLabel(" 4 Gün 5 Gece ");
        I15.setBounds(200, 210, 200, 30);
        I15.setForeground(Color.darkGray);
        add(I15);


        JLabel I5 = new JLabel("Kalkış Tarihi ve Saati :");
        I5.setBounds(30, 260, 200, 30);
        add(I5);
      
        JLabel I16 = new JLabel(" 14.05.22 --  9.30");
        I16.setBounds(200, 260, 200, 30);
        I16.setForeground(Color.DARK_GRAY);
        add(I16);

        JLabel I6 = new JLabel("Ücret :");
        I6.setBounds(30, 310, 200, 30);
        add(I6);

       JLabel I17 = new JLabel(" 1459 TL (Türk Lirası)");
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
       

        s = "Gezimizin Detayları; \n\n"
                + "   **1.GÜN  \n\n"
                + "Biniş noktalarından katılacak misafirlerimizle birlikte gece yolculuğumuz başlıyor.\n \n"
                
                + "Sabah saatlerinde Trabzon’a ulaşıyoruz.\n Yapacağımız yöresel kahvaltının ardından Trabzon Ayasofya’sına hareket ediyoruz.\n Kommenos Krallığı döneminde İstanbul’daki Ayasofya’ya ithafen yapılan bu mimari harikayı ve fresklerini tanıdıktan \n sonra bölgenin en büyük gümüş atölyesine gidiyoruz. Burada Gümüş, \n\n"
                + "Telkâri, Trabzon\n hasır bileziği ve ülkemizde sadece Trabzon’da üç aile tarafından yapılan, Kazaz Türkleri tarafından bölgeye \n kazandırılan en değerli sanat olarak nitelendirilen ve bayanlar için hayranlık \n uyandıran işçiliğiyle Kazaziye sanatının inceliklerini öğreniyoruz. Alışveriş molamızın ardından Gülbahar Hatun \n"
                + " Camii ve Zağnos Deresi yanından Trabzon kalesini de panoramik olarak görerek Soğuksu \n"
                + " Tepesi’ndeki Art Neuve (Yeni Sanat) tarzında Konstantin Kabayanidis’ in \n  yaptırmış olduğu ve Trabzon halkının Ata’ya "
                + "armağanı olan Atatürk Köşkü’nü görüyoruz.\n Atatürk Köşkü gezimiz sonrasında Trabzon’un Maçka ilçesinden geçerek \n koruma altında olan Altındere milli parkına ulaşıyoruz. Coşandere \n"
                + " boyunca doğanın görkemli güzelliklerini seyrederek yapacağımız bu yolculuk Sümela Manastırı’nın görünmesiyle taçlanacak. (Restorasyon çalışmalarından dolayı \n"
                + "Sümela manastırı içerisine girilemese dahi Sümela Manastırının görülebildiği o meşhur noktadan"
                + " fotoğraflarını çekebilmek amacıyla Altındere milli parkına girilecektir)  \n Karadağ’ın en sarp yerinde"
                + " kurulmuş olan manastırın manzarası sizleri büyüleyecek. \n Meryem Ana Kilisesi, Nöbetçi Odaları, Misafirhane, Ayazma,\n"
                + " Su Kemerleri, Kaya Fresklerini rehberimizin anlatımıyla öğrendikten sonra otelimize geçiyoruz. Akşam yemeği ve konaklama otelimizde. \n               "
                + " Bu uygulama, belirli bir varış noktasına seyahat ile ilgili \n bilgilere büyük bir kolaylıkla  erişmede yardımcı olacaktır\n\n"
              
                + " **3.GÜN \n\n\n"
                + "   Sabah otelde aldığımız kahvaltımızın ardından Sürmene’ye ulaşıyoruz.\n "
                + "Sürmene’de Karadeniz yaylaları ve ormanlarında üretilen kestane/çiçek balı, yöresel muhlamalık peynir, tereyağı,\n"
                + " mısır unu gibi ürünleri de alabileceğimiz serbest zamanımızın ardından binlerce yıllık el sanatı kültürünün evrensel boyuta ulaştığı\n "
                + "Sürmene bıçaklarının hangi aşamalardan geçtiğini öğreneceğiz ve Sürmene bıçağı alma imkânı bulacağız. Alışveriş molamızın ardından çay toplama\n "
                + "makasını alıp çay bahçesinin içine girerek hem çay topluyoruz hem de hatıra fotoğraflarımızı çekiniyoruz Karadeniz denildiğinde akla ilk gelen ürün\n"
                + " olan ve istatistiksel olarak ülkemizde en çok tüketilen ürünlerin başında gelen çay bitkisinin sofralarımıza ulaşana kadar hangi \n"
                + "aşamalardan geçtiğini öğrenebileceğimiz çay fabrikası ziyaretimizi gerçekleştiriyoruz. İkram edilen çaylar eşliğinde yapılacak sunumda\n "
                + "çay hakkında bilmediğimiz birçok şeyi yerinde öğrenme fırsatı bularak ulusal marketlerde bulunması çok zor olan Mayıs Çayını alabilme\n"
                + " imkânımız oluyor.  Çay fabrikası gezimiz sonrasında Çaykara'ya geliyor ve buradan Uzungöl’ e çıkıyoruz. Deniz seviyesinden\n"
                + "1090 m yükseklikte bulunan Uzungöl, dik yamaçları ve muhteşem orman örtüsü ile Alplerin güzelliğini geride bırakmaktadır.\n "
                + "Vadinin ortasında bulunan ve yamaçlardan düşen kayaların Haldizen Deresi’nin önünü kapatmasıyla oluşmuş göl, “Uzungöl” olarak bilinir\n"
                + " ve çevreye aynı ad verilmiştir. Özellikle yakınındaki “Şerah” Köyünün yöreye uygun tarzda yapılmış eski ahşap evler, doğanın güzelliğini\n"
                + " tamamlar özelliktedir. Karadeniz’in en meşhur gölü olan Uzungöl çevresinde yapacağımız gezimiz sonrasında otobüsümüze binerek organik \n"
                + "tekstilin en önemli unsurlarından birisi olan, alerji cilt-deri hastalıklarında kullanılması şiddetle tavsiye olunan kenevir dokumaları\n"
                + " görebileceğimiz, yöresel kıyafetlerin vazgeçilmezi Karadeniz keşan ve poşularını bulabileceğimiz Rize Bezi Dokuma \n"
                + "Atölyesine geçiyoruz. Rize Bezi dokumalarında alacağımız sunum sonrasında otelimize geçiyoruz. Otelimizde alacağımız\n"
                + " akşam yemeğinin ardından dileyen misafirlerimizle gece ışıklandırmaları ile meşhur olan Batum Gezisine gidiyoruz \n"
                + "(EKSTRA 90 TL). Sarp sınır kapısında giriş işlemlerimizi tamamladıktan sonra Gürcistan/ Acara bölgesine geçiyoruz.\n"
                + " Hz. İsa’nın on iki havarisinden biri olan St. Mathias`ın mezarının da bulunduğu Roma döneminden kalan ve en son \n "
                + "Osmanlılar döneminde kullanılan Gonio- Apsaros Kalesi’ni (panoramik) görüyoruz. Poseidon Heykeli, Tiyatro Binasını,\n "
                + "Medea Heykelini ve yeni oluşturulan yüzüyle Avrupa Meydanını göreceğiz. Batum Bulvarı'nda gezinti yaptıktan sonra \n"
                + " serbest zaman vereceğiz. Serbest zamanımızın ardından Türkiye’ye dönüyoruz. Türkiye’ye girerken Duty Free’den \n"
                + "rehberinizin belirleyeceği bir zaman süresince alışveriş yapma imkânı bulabileceksiniz. Türkiye’ye giriş yaptıktan \n"
                + "sonra otelimize geçiyoruz. \n\n";
             
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
        new Karadeniz().setVisible(true);
    }

}
