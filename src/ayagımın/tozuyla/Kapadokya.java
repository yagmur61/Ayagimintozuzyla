package ayagımın.tozuyla;

import java.awt.*;
import javax.swing.*;

public class Kapadokya extends JFrame {

    String s;

    Kapadokya() {
        setLayout(null);
        setBounds(670, 190, 1000, 700);
        getContentPane().setBackground(Color.WHITE);

        JLabel I11 = new JLabel("Kapadokya Turu");
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

        JLabel I13 = new JLabel("Ihlara Vadisi  ");
        I13.setBounds(200, 110, 200, 30);
        I13.setForeground(Color.DARK_GRAY);
        add(I13);

        JLabel I3 = new JLabel("Kişi Sayısı :");
        I3.setBounds(30, 160, 200, 30);
        add(I3);

        JLabel I14 = new JLabel("15-20 ");
        I14.setBounds(200, 160, 200, 30);
        I14.setForeground(Color.DARK_GRAY);
        add(I14);

        JLabel I4 = new JLabel("Gezi Süresi :");
        I4.setBounds(30, 210, 200, 30);
        add(I4);

        JLabel I15 = new JLabel(" 2 Gün 3 Gece ");
        I15.setBounds(200, 210, 200, 30);
        I15.setForeground(Color.darkGray);
        add(I15);

        JLabel I5 = new JLabel("Kalkış Tarihi ve Saati :");
        I5.setBounds(30, 260, 200, 30);
        add(I5);

        JLabel I16 = new JLabel(" 19.07.22 --  06.30");
        I16.setBounds(200, 260, 200, 30);
        I16.setForeground(Color.DARK_GRAY);
        add(I16);

        JLabel I6 = new JLabel("Ücret :");
        I6.setBounds(30, 310, 200, 30);
        add(I6);

        JLabel I17 = new JLabel(" 779 TL (Türk Lirası)");
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

        s = "Gezimizin Detayları; \n \n "
                + "   **1.GÜN  \n \n "
                + "  Otobüs ikramları eşliğinde, Kahvaltı molası vereceğimiz Şereflikoçhisar’a ulaşıyoruz.\n "
                + "Daha sonrasında ülkemizin en büyük ikinci gölü olan Tuz gölünde vereceğimiz kısa fotoğraf molası sonrasın Aksaray üzerinden Türkiye’nin en büyük kanyonlarından biri olan,\n"
                + " 14 km uzunluğundaki Ihlara Vadisi ne ulaşıyoruz. Burada Ağaçaltı kilisesini gezerek, Melendiz Çayının oluşturmuş olduğu nehir yatağında yürüyüş yapıyoruz.\n"
                + " Verilen serbest zamanda bu cennet bahçesinde fotoğraflarımızı çekiyoruz. Bir sonraki durağımız ise bir\n "
                + "yanardağ ağzı olan ve jeotermal suya sahip Narlıgöl olacak. Burada verilen fotoğraf molasını takiben, bölgedeki 104\n "
                + "farklı yer altı şehrinden biri olan Derinkuyu veya Kaymaklı Yer altı Şehrine ulaşıyoruz. Yeraltında bulunan tünelleri gezip anlatımları\n "
                + "dinledikten sonra yolumuz bizleri Çardak Köyü üzerinden Göreme'ye götürecek. Öğle yemeğimizin ardından bir sonraki durağımız üzüm bağları ve üç başlı\n"
                + " peri bacaları ile ünlü Paşabağ mevkii olacak. Burada verilen serbest zamanı takiben hayaller vadisi olarak geçen Dervent Vadisi olacak. Burada çekilen \n"
                + "birbirinden ilginç fotoğrafların ardından, kesme taş evleri ile meşhur Ürgüp'e ulaşıyoruz. Şehir merkezinde yapacağımız panoramik tur sonrası\n "
                + "şarap mahzenlerini ziyaret ediyoruz. Günümüzün son durağı ise 3 Güzeller olarak bilinen peri bacaları olacak. Burada verilen fotoğraf molasını \n"
                + "takiben otelimize ulaşıyoruz. Otele yerleşme ve akşam yemeğimiz otelimizde.)\n \n"
                + "   **2.GÜN  \n \n "
                + "Değerli misafirlerimiz; Balon'a katılmak isteyen misafirlerimizle sabahın erken saatlerinde lobide buluşma ve"
                + " balon kalkış noktasına transferlerini yapıyoruz(Ekstra). Bu unutulmayacak deneyim konusunda genel \n"
                + "bilgiyi rehberimiz verecektir. Sabah otelde alınan açık büfe kahvaltı sonrası\n "
                + "günümüzün ilk fotoğraf molası Güvercinlik Vadisi – Uçhisar Kalesi olacak. Panoramik olarak çekilen fotoğraf ardından, Kızılırmak’ın\n "
                + "suyu ile kil toprağını birleştiren insanoğlunun 5000 yıldır geçim kaynağı olan çömlekçilik sanatını görmek için çömlek atölyesine gidiyoruz.\n "
                + "Geçireceğimiz keyifli dakikaların ardından kayalık göreme olarak bilinen ve zamanında manastır yaşantısının hüküm sürdüğü Göreme açık hava müzesine\n "
                + "gidiyoruz. Burada Hristiyanlık tarihi hakkında verilen bilgilerin ardından Elmalı Kilise, Çarıklı Kilise, Yılanlı Kilise gibi sayısız kiliseyi gezebilirsiniz\n"
                + ". Daha sonrasında mermergiller familyasından olan Kapadokya bölgesinden çıkan Onyx taşının işlendiği atölyeye gidiyoruz. Burada yapılan anlatımlar\n"
                + " ardından Avanos üzerinden yolumuza devam ederek Hacı Bektaş ilçesine doğru yol alıyoruz. Burada Horasan erenlerinden Hacı Bektaş-ı Veli'nin kurmuş\n "
                + "olduğu dergâhı ziyaret ediyoruz. Yapılan anlatımlar ve edilen duaların ardından Kırşehir, Ankara üzerinden dönüş yolculuğuna başlıyoruz ve siz sayın\n "
                + "misafirlerimizi bir başka  organizasyonunda buluşmak dileği ile gecenin ilerleyen saatlerinde aldığımız noktalara bırakıyoruz.\n\n\n\n";

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
        new Kapadokya().setVisible(true);
    }

}
