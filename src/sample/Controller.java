package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    @FXML
    private CheckBox ankara;

    @FXML
    private CheckBox Zonguldak;

    @FXML
    private CheckBox Bartın;

    @FXML
    private CheckBox Kastamonu;

    @FXML
    private CheckBox Sinop;

    @FXML
    private CheckBox Samsun;

    @FXML
    private CheckBox Ordu;

    @FXML
    private CheckBox Giresun;

    @FXML
    private CheckBox Gümüşhane;

    @FXML
    private CheckBox Trabzon;

    @FXML
    private CheckBox Sivas;

    @FXML
    private CheckBox Erzincan;

    @FXML
    private CheckBox Tunceli;

    @FXML
    private CheckBox Tokat;

    @FXML
    private CheckBox Amasya;

    @FXML
    private CheckBox Çorum;

    @FXML
    private CheckBox Yozgat;

    @FXML
    private CheckBox Kayseri;

    @FXML
    private CheckBox Kahramanmaraş;

    @FXML
    private CheckBox Şanlıurfa;

    @FXML
    private CheckBox Rize;

    @FXML
    private CheckBox Nevşehir;
    @FXML
    private TextField göndermetin;

    @FXML
    private Button gönder;

    @FXML
    private CheckBox Kırşehir;

    @FXML
    private CheckBox Kırıkkale;

    @FXML
    private CheckBox Eskişehir;

    @FXML
    private CheckBox Afyonkarahisar;

    @FXML
    private CheckBox Konya;

    @FXML
    private CheckBox Bayburt;

    @FXML
    private CheckBox Erzurum;

    @FXML
    private CheckBox Artvin;

    @FXML
    private CheckBox Ardahan;

    @FXML
    private CheckBox Hakkari;

    @FXML
    private CheckBox van;

    @FXML
    private CheckBox Ağrı;

    @FXML
    private CheckBox Kars;

    @FXML
    private CheckBox Muş;

    @FXML
    private CheckBox Diyarbakır;

    @FXML
    private CheckBox Bingöl;

    @FXML
    private CheckBox ığdır;

    @FXML
    private CheckBox Siirt;

    @FXML
    private CheckBox Mardin;

    @FXML
    private CheckBox Şırnak;

    @FXML
    private CheckBox Batman;

    @FXML
    private CheckBox Elazığ;

    @FXML
    private CheckBox Malatya;

    @FXML
    private CheckBox Adıyaman;

    @FXML
    private CheckBox Bitlis;

    @FXML
    private CheckBox Adana;

    @FXML
    private CheckBox Karaman;

    @FXML
    private CheckBox Mersin;

    @FXML
    private CheckBox Çankırı;

    @FXML
    private CheckBox Antalya;

    @FXML
    private CheckBox Isparta;

    @FXML
    private CheckBox Kütahya;

    @FXML
    private CheckBox Bolu;

    @FXML
    private CheckBox sakarya;

    @FXML
    private CheckBox Tekirdağ;

    @FXML
    private CheckBox Kırklareli;

    @FXML
    private CheckBox Manisa;

    @FXML
    private CheckBox Balıkesir;

    @FXML
    private CheckBox çanakkale;

    @FXML
    private CheckBox istanbul;

    @FXML
    private CheckBox Edirne;

    @FXML
    private CheckBox bursa;

    @FXML
    private CheckBox İzmir;

    @FXML
    private CheckBox Aydın;

    @FXML
    private CheckBox Muğla;

    @FXML
    private CheckBox Denizli;

    @FXML
    private CheckBox Burdur;

    @FXML
    private CheckBox Uşak;

    @FXML
    private CheckBox Niğde;

    @FXML
    private CheckBox Aksaray;

    @FXML
    private CheckBox Bilecik;

    @FXML
    private CheckBox Düzce;

    @FXML
    private CheckBox Osmaniye;

    @FXML
    private CheckBox Hatay;

    @FXML
    private CheckBox Gaziantep;

    @FXML
    private CheckBox Kilis;

    @FXML
    private CheckBox yalova;

    @FXML
    private CheckBox kocaeli;

    @FXML
    private CheckBox Karabük;

    @FXML
    private Button start;
    @FXML
    private Label textbir;

    @FXML
    private Label textiki;
    @FXML
    private Polyline cizgi;

    int sayac=0;
//int sehirsayisi;
int cityCount;
    @FXML
    void Sehirsayisi(ActionEvent event) {

        cityCount = Integer.parseInt(göndermetin.getText());
        System.out.println("Kac sehre gitmek istiyorsunuz?");
        System.out.println(cityCount);
textbir.setVisible(false);
textiki.setVisible(false);
gönder.setVisible(false);
göndermetin.setVisible(false);
  ankara.setVisible(true);
Zonguldak.setVisible(true);
Karabük.setVisible(true);
Bartın.setVisible(true);
Kastamonu.setVisible(true);
Sinop.setVisible(true);
Samsun.setVisible(true);
 Ordu.setVisible(true);
 Giresun.setVisible(true);
Gümüşhane.setVisible(true);
 Trabzon.setVisible(true);
Sivas.setVisible(true);
Erzincan.setVisible(true);
 Tunceli.setVisible(true);
 Tokat.setVisible(true);
 Amasya.setVisible(true);
 Çorum.setVisible(true);
Yozgat.setVisible(true);
Kayseri.setVisible(true);
Kahramanmaraş.setVisible(true);
Şanlıurfa.setVisible(true);
Rize.setVisible(true);
Nevşehir.setVisible(true);
Kırşehir.setVisible(true);
Kırıkkale.setVisible(true);
Eskişehir.setVisible(true);
Afyonkarahisar.setVisible(true);
Konya.setVisible(true);
Bayburt.setVisible(true);
Erzurum.setVisible(true);
Artvin.setVisible(true);
Ardahan.setVisible(true);
Hakkari.setVisible(true);
van.setVisible(true);
Ağrı.setVisible(true);
Kars.setVisible(true);
Muş.setVisible(true);
Diyarbakır.setVisible(true);
Bingöl.setVisible(true);
ığdır.setVisible(true);
Siirt.setVisible(true);
Mardin.setVisible(true);
Şırnak.setVisible(true);
Batman.setVisible(true);
Elazığ.setVisible(true);
Malatya.setVisible(true);
Adıyaman.setVisible(true);
Bitlis.setVisible(true);
Adana.setVisible(true);
Karaman.setVisible(true);
Mersin.setVisible(true);
Çankırı.setVisible(true);
Antalya.setVisible(true);
Isparta.setVisible(true);
Kütahya.setVisible(true);
Bolu.setVisible(true);
sakarya.setVisible(true);
Tekirdağ.setVisible(true);
Kırklareli.setVisible(true);
Manisa.setVisible(true);
Balıkesir.setVisible(true);
çanakkale.setVisible(true);
istanbul.setVisible(true);
Edirne.setVisible(true);
bursa.setVisible(true);
İzmir.setVisible(true);
Aydın.setVisible(true);
Muğla.setVisible(true);
Denizli.setVisible(true);
Burdur.setVisible(true);
Uşak.setVisible(true);
Niğde.setVisible(true);
Aksaray.setVisible(true);
Bilecik.setVisible(true);
Düzce.setVisible(true);
Osmaniye.setVisible(true);
Hatay.setVisible(true);
Gaziantep.setVisible(true);
Kilis.setVisible(true);
yalova.setVisible(true);
Karabük.setVisible(true);
start.setVisible(true);
    }
DijkstrasAlgorithm dj = new DijkstrasAlgorithm();
    int[] Bastirilacaksehir =new int[100];
    public static int[] travellings(int x, int sehir[]){
        int[] cities = new int[x+1];
        cities[0] = 40;
        for(int j = 1 ; j <= x ; j++){

            cities[j] = sehir[j];
            System.out.println(cities[j]);
        }
        return cities;
    }
    int[] sehirler = new int[82];
    int  plaka;
    @FXML
    void SehirEkle(ActionEvent event)throws IOException {
        sehirler[0]=40;
start.setVisible(false);
        System.out.println("Seçilen Şehirler:\n");
while(sayac<cityCount)
{
    if(Adana.isSelected()== true )
    {
        plaka =1;
        System.out.println(plaka+"\n");
        plaka=plaka-1;
       sayac++;
        sehirler[sayac]=plaka;
    }
    if(Adıyaman.isSelected()== true )
    {
        plaka =2;
        System.out.println(plaka+"\n");
        plaka=plaka-1;
        sayac++;
        sehirler[sayac]=plaka;
    }if(Afyonkarahisar.isSelected()== true )
{
    plaka =3;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Ağrı.isSelected()== true )
{
    plaka =4;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Amasya.isSelected()== true )
{
    plaka =5;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(ankara.isSelected()== true )
{
    plaka =6;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Antalya.isSelected()== true )
{
    plaka =7;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Artvin.isSelected()== true )
{
    plaka =8;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Aydın.isSelected()== true )
{
    plaka =9;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Balıkesir.isSelected()== true )
{
    plaka =10;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Bilecik.isSelected()== true )
{
    plaka =11;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Bingöl.isSelected()== true )
{
    plaka =12;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Bitlis.isSelected()== true )
{
    plaka =13;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Bolu.isSelected()== true )
{
    plaka =14;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Burdur.isSelected()== true )
{
    plaka =15;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(bursa.isSelected()== true )
{
    plaka =16;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(çanakkale.isSelected()== true )
{
    plaka =17;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Çankırı.isSelected()== true )
{
    plaka =18;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Çorum.isSelected()== true )
{
    plaka =19;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Denizli.isSelected()== true )
{
    plaka =20;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Diyarbakır.isSelected()== true )
{
    plaka =21;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Edirne.isSelected()== true )
{
    plaka =22;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Elazığ.isSelected()== true )
{
    plaka =23;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Erzincan.isSelected()== true )
{
    plaka =24;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Erzurum.isSelected()== true )
{
    plaka =25;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Eskişehir.isSelected()== true )
{
    plaka =26;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Gaziantep.isSelected()== true )
{
    plaka =27;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Giresun.isSelected()== true )
{
    plaka =28;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Gümüşhane.isSelected()== true )
{
    plaka =29;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Hakkari.isSelected()== true )
{
    plaka =30;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Hatay.isSelected()== true )
{
    plaka =31;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Isparta.isSelected()== true )
{
    plaka =32;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Mersin.isSelected()== true )
{
    plaka =33;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(istanbul.isSelected()== true )
{
    plaka =34;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(İzmir.isSelected()== true )
{
    plaka =35;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Kars.isSelected()== true )
{
    plaka =36;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Kastamonu.isSelected()== true )
{
    plaka =37;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Kayseri.isSelected()== true )
{
    plaka =38;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Kırklareli.isSelected()== true )
{
    plaka =39;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Kırşehir.isSelected()== true )
{
    plaka =40;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(kocaeli.isSelected()== true )
{
    plaka =41;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Konya.isSelected()== true )
{
    plaka =42;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Kütahya.isSelected()== true )
{
    plaka =43;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Malatya.isSelected()== true )
{
    plaka =44;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Manisa.isSelected()== true )
{
    plaka =45;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Kahramanmaraş.isSelected()== true )
{
    plaka =46;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Mardin.isSelected()== true )
{
    plaka =47;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Muğla.isSelected()== true )
{
    plaka =48;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Muş.isSelected()== true )
{
    plaka =49;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Nevşehir.isSelected()== true )
{
    plaka =50;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Niğde.isSelected()== true )
{
    plaka =51;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Ordu.isSelected()== true )
{
    plaka =52;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Rize.isSelected()== true )
{
    plaka =53;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(sakarya.isSelected()== true )
{
    plaka =54;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Samsun.isSelected()== true )
{
    plaka =55;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Siirt.isSelected()== true )
{
    plaka =56;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Sinop.isSelected()== true )
{
    plaka =57;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Sivas.isSelected()== true )
{
    plaka =58;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Tekirdağ.isSelected()== true )
{
    plaka =59;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Tokat.isSelected()== true )
{
    plaka =60;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Trabzon.isSelected()== true )
{
    plaka =61;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Tunceli.isSelected()== true )
{
    plaka =62;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Şanlıurfa.isSelected()== true )
{
    plaka =63;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Uşak.isSelected()== true )
{
    plaka =64;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(van.isSelected()== true )
{
    plaka =65;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Yozgat.isSelected()== true )
{
    plaka =66;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Zonguldak.isSelected()== true )
{
    plaka =67;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Aksaray.isSelected()== true )
{
    plaka =68;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Bayburt.isSelected()== true )
{
    plaka =69;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Karaman.isSelected()== true )
{
    plaka =70;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Kırıkkale.isSelected()== true )
{
    plaka =71;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Batman.isSelected()== true )
{
    plaka =72;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Şırnak.isSelected()== true )
{
    plaka =73;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Bartın.isSelected()== true )
{
    plaka =74;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Ardahan.isSelected()== true )
{
    plaka =75;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(ığdır.isSelected()== true )
{
    plaka =76;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(yalova.isSelected()== true )
{
    plaka =77;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Karabük.isSelected()== true )
{
    plaka =78;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Kilis.isSelected()== true )
{
    plaka =79;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Osmaniye.isSelected()== true )
{
    plaka =80;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}if(Düzce.isSelected()== true )
{
    plaka =81;
    System.out.println(plaka+"\n");
    plaka=plaka-1;
    sayac++;
    sehirler[sayac]=plaka;
}
}

        int[][] adjacencyMatrix = {
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,191,0,69,0,0,0,0,335,0,0,0,0,0,0,0,192,0,0,0,0,207,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,87,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,207,0,0,0,0,0,150,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,187,0,163,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,112,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,169,0,0,0,0,222,0,0,0,0,0,144,0,0,0,0,0,168,0,0,0,0,0,0,0,0,0,223,100,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,115,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,234,0,0,0,0,0,0,0,0,0,0,0,183,0,0,0,0,0,0,0,0,0,0,214,0,0,0,0,0,0,0,0,0,0,0,0,245,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,228,0,0,0,0,0,0,0,0,0,0,143,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,92,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,131,0,0,0,0,114,0,0,0,0,0,200,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,191,0,0,0,130,0,0,0,0,0,0,0,233,0,0,0,0,0,0,0,0,0,0,0,0,0,184,0,258,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,225,0,0,75,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,122,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,130,466,0,0,0,0,0,0,0,0,322,0,0,0,0,0,311,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,374,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,226,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,161,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,116,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,126,0,0,0,0,0,0,0,0,0,0,0,0,0,0,126,0,0,0,0,0,0,0,0,0,155,0,0,99,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,151,198,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,176,0,0,0,0,0,0,0,228,0,141,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,213,0,94,0,0,0,0,0,0,0,0,0,83,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,112,0,0,0,0,0,0,0,0,0,0,99,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,141,0,144,275,177,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,111,0,0,0,0,0,0,0,0,0,0,0,0,144,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,234,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,83,0,0,0,0,0,0,96,0,0,0,0,0,0,0,0,161,0,0,0,0,0,0,135,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,191,0,0,0,0,213,0,0,0,0,0,0,233,0,0,0,0,0,0,0,291,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,114,0,0,0,0,0,0,0,0,0,0,0,0,157,0,0,0,0,0,0,0,0,0,0,134,0,0,45},
                {0,0,169,0,0,0,122,0,0,0,0,0,0,0,0,0,0,0,0,150,0,0,0,0,0,0,0,0,0,0,0,51,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,241,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,151,94,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,132,0,177,0,0,0,0,0,0,0,0,0,0,157,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,69,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,198,0,0,0,0,0,0,0,0,0,0,0,216,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,187,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,130,0,0,0,0,0,0,0,233,0,0,0,0,156,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,106,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,104,0,0,0,0,0,0,193,0,0,0},
                {0,0,0,0,92,0,0,0,0,0,0,0,0,0,0,0,0,156,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,197,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,172,0,266,0,0,0,0,0,0,0,0,108,0,0,0,0,166,0,0,0,0,0,0,0,0,0,0},
                {0,0,222,0,0,0,0,0,126,0,0,0,0,0,150,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,208,0,0,145,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,150,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,207,0,0,0,0,0,0,0,0,0,141,0,0,0,0,0,0,0,0,0,0,153,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,249,0,0,96,0,252,0,0,0,0,0,0,0,0,0,0,0,0,0,176,0,0,0,0,0,0,0,0,100,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,216,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,62,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,140,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,144,0,0,0,0,0,0,0,0,153,0,0,267,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,98,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,136,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,275,0,0,0,0,0,0,0,0,0,0,267,0,190,0,0,295,133,0,0,0,0,0,0,0,0,0,0,0,0,0,0,363,0,0,0,0,0,0,0,0,0,0,0,0,0,248,0,0,0,131,0,0,0,0,0,0,155,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,183,0,0,0,226,0,0,0,177,0,0,0,0,0,0,0,0,0,0,0,190,0,0,0,0,0,0,0,0,0,0,0,203,0,0,0,0,0,0,0,0,0,0,0,0,266,0,0,0,259,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,125,0,0,0,0,0,233,0,0,0,0,0,0},
                {0,0,144,0,0,233,0,0,0,0,83,0,0,291,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,338,78,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,150,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,193,0,0,0,0,0,0,0,0,0,0,0,0,0,0,76,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,137,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,64,125,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,295,0,0,0,0,162,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,44,0,0,0,0,0,298,0,0,136,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,133,0,0,0,162,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,100,0,0,0,0,0,0,0,78,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,197,0,0,0,0,0,0,0,189,0,0,0,0,0,0,0,0},
                {191,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,193,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,129,0},
                {0,0,168,0,0,0,130,0,0,0,0,0,0,0,51,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,263,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {69,0,0,0,0,0,466,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,348,0,0,0,0,0,0,0,0,200,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,235,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,111,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,131,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,126,176,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,35,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,214,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,203,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,94,140,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,106,197,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,183,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,183,0,0,0,114,0,0,0},
                {335,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,261,0,0,0,81,128,0,0,0,0,0,0,194,0,0,0,0,0,0,0,197,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,62,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,121,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,184,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,91,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,112,0,110,0,0,113,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,132,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,111,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,37,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,65,0,0,0,0},
                {0,0,223,0,0,258,322,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,338,0,0,0,0,0,263,348,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,242,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,148,0,119,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,100,0,0,0,0,0,0,228,112,0,0,0,0,177,0,0,0,0,0,0,0,0,0,78,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,316,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,139,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,187,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,249,0,98,363,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,224,0,0,0,0,0,0,0,0,0,0,0,243,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,155,141,0,0,0,0,0,0,0,0,0,208,0,0,0,0,0,0,0,0,0,0,0,0,0,0,35,0,0,0,0,0,0,0,316,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,195,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {192,163,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,76,0,0,0,0,0,0,0,0,0,0,261,0,0,0,0,0,224,0,0,0,0,0,0,0,0,0,0,0,0,0,327,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,105,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,96,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,227,0,0,0,0,0,0,188,0,0,0,0,0,0,0,0,150,197,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,311,0,99,0,0,0,0,0,241,0,0,0,0,145,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,245,0,0,0,0,0,0,0,111,83,0,0,0,0,0,0,0,252,0,0,0,266,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,218,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,81,0,91,0,0,0,0,0,0,0,0,0,0,82,0,0,0,0,0,0,0,0,0,0,0,0,0,0,203,0,75,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {207,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,200,0,0,0,0,128,0,0,0,242,0,0,0,0,0,0,0,82,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,122,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,44,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,150,0,0,0,0,216,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,161,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,259,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,75,0,0,0,0,0,0,0,253,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,99,0,0,114,0,157,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,37,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,69},
                {0,0,0,0,131,0,0,0,0,0,0,0,0,0,0,0,0,0,172,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,150,0,0,0,0,155,0,0,229,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,96,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,227,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,257,0,0,0,0,0,0,86,100,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,266,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,183,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,155,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,248,0,0,0,298,0,0,0,0,0,0,0,0,0,194,0,0,0,0,0,243,0,327,0,0,0,0,0,314,0,0,0,0,0,0,0,108,0,0,0,0,0,224,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,187,0,0,0,0,140,0,0,0,0,0,0,0,0,0,0,0,131,0,0,0,0,121,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,114,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,216,0,0,229,0,0,108,0,0,0,0,0,0,0,205,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,136,100,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,75,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,178,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,144,0,0,0,0,0,0,0,0,0,0,136,131,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,112,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,176,0,0,0,0,0,137,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,188,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,115,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,150,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,139,0,195,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,228,0,0,0,0,0,0,0,0,161,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,197,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,257,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,357,0,0,0,0,0,0,0,0},
                {0,0,0,0,200,0,0,0,0,0,0,0,0,0,0,0,0,0,108,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,197,0,112,0,0,0,0,0,0,0,0,0,203,0,0,0,0,0,0,0,224,0,205,0,0,0,0,0,0,0,0,0,0,140,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,157,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,87,0,0,0,100,0,0,113},
                {0,0,0,0,0,225,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,110,0,148,0,0,0,0,0,0,0,75,122,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,155,125,0,0,0,78,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,253,0,0,0,0,0,0,0,178,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,374,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,235,0,0,0,0,0,0,0,0,119,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,75,0,0,0,0,0,0,0,0,0,0,0,104,166,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,113,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,140,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,135,0,0,0,0,0,0,0,100,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,150,0,218,0,0,0,0,0,0,86,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,189,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,197,0,0,0,0,0,0,0,0,100,0,0,0,0,0,0,0,0,357,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,183,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,87,0,0,0,0,0,0,0,0,0,0,89,0,0,0},
                {0,0,0,0,0,0,0,116,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,233,0,0,0,0,0,0,0,0,0,0,94,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,143,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,140,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,69,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,65,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,134,0,0,0,193,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,114,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,100,0,0,0,0,0,0,89,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,64,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {87,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,125,0,0,0,129,0,0,0,0,0,0,0,0,0,0,0,0,0,0,105,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,45,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,69,0,0,0,0,0,0,0,0,0,0,0,0,113,0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        };
        dj.readFileAndPrintCities();
        int[] travellingCities = travellings(cityCount,sehirler);

        ArrayList<City> cities = new ArrayList<>();

        for(int i = 0 ; i <= cityCount ; i++ ){
            cities.add(new City(travellingCities[i]));
        }

        for(int q = 0 ; q <= cityCount ; q++){

            dj.dijkstra(adjacencyMatrix , travellingCities[q] , cities);

        }
        System.out.println();
        System.out.println();
        for(int q = 0 ; q <= cityCount ; q++){

            System.out.print(cities.get(q).getPlateNo() + "   ");
            for (int i = 0 ; i < 81 ; i ++){
                System.out.print(cities.get(q).distancesToOtherCities.get(i) + "-");
            }
            System.out.println();
        }

        for(int q = 0 ; q <= cityCount ; q++){

            System.out.print(cities.get(q).getPlateNo() + "   ");
            for (int i = 0 ; i < 81 ; i ++){
                System.out.print(cities.get(q).paths.get(i) + "-");
            }
            System.out.println();
        }

        int[][] arrayForTSP = new int[cityCount+1][cityCount+1];

        for(int i = 0 ; i <= cityCount ; i ++ ){

            for( int j = 0 ; j <= cityCount ; j++){

                if(i == j){
                    arrayForTSP[i][j] = 0;
                }
                else
                    arrayForTSP[i][j] = cities.get(i).distancesToOtherCities.get(travellingCities[j]);

            }
        }

        for(int i = 0 ; i <= cityCount ; i ++ ){

            for( int j = 0 ; j <= cityCount ; j++){
                System.out.print(arrayForTSP[i][j] + "  ");
            }
            System.out.println();
        }

        Traveller tsp = new Traveller(cityCount+1);

        tsp.TSP(arrayForTSP);

        System.out.printf("Minimum cost : %d\n", tsp.final_res);
        System.out.printf("Path Taken : ");
        for (int i = 0; i <= tsp.N; i++)
        {
            System.out.printf("%d ", tsp.final_path[i]);
        }

        System.out.print("\nPath taken : ");
        for (int temp:tsp.final_path) {
            System.out.print(travellingCities[temp] + " ");
        }


        for(int i = 0 ; i <= cityCount ; i++ ){
            System.out.print("\n" + cities.get(tsp.final_path[i]).paths.get(travellingCities[tsp.final_path[i+1]]));
        }

        ArrayList<Integer> pathForMapDrawing = new ArrayList<>();

        for(int i = 0 ; i <= cityCount ; i++){
            for(int j = 0 ; j < cities.get(tsp.final_path[i]).paths.get(travellingCities[tsp.final_path[i+1]]).size()-1 ; j++){
                pathForMapDrawing.add(cities.get(tsp.final_path[i]).paths.get(travellingCities[tsp.final_path[i+1]]).get(j));
            }
            if(i == cityCount){
                pathForMapDrawing.add(cities.get(0).getPlateNo());
            }
        }

        System.out.println();
        cizgi.setVisible(true);
        int sehirnumara=0;
        for (int t :pathForMapDrawing
        ) {

Bastirilacaksehir[sehirnumara]=t+1;
            if(Bastirilacaksehir[sehirnumara]== 1)
            {
               cizgi.getPoints().addAll(new Double[]{
                        Adana.getLayoutX()-cizgi.getLayoutX()+10,Adana.getLayoutY()-cizgi.getLayoutY()+10
                });
            }
            if(Bastirilacaksehir[sehirnumara]== 2)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Adıyaman.getLayoutX()-cizgi.getLayoutX()+10,Adıyaman.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 3)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Afyonkarahisar.getLayoutX()-cizgi.getLayoutX()+10,Afyonkarahisar.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 4)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Ağrı.getLayoutX()-cizgi.getLayoutX()+10,Ağrı.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 5)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Amasya.getLayoutX()-cizgi.getLayoutX()+10,Amasya.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 6)
            {
                cizgi.getPoints().addAll(new Double[]{
                        ankara.getLayoutX()-cizgi.getLayoutX()+10,ankara.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 7)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Antalya.getLayoutX()-cizgi.getLayoutX()+10,Antalya.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 8)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Artvin.getLayoutX()-cizgi.getLayoutX()+10,Artvin.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 9)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Aydın.getLayoutX()-cizgi.getLayoutX()+10,Aydın.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 10)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Balıkesir.getLayoutX()-cizgi.getLayoutX()+10,Balıkesir.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 11)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Bilecik.getLayoutX()-cizgi.getLayoutX()+10,Bilecik.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 12)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Bingöl.getLayoutX()-cizgi.getLayoutX()+10,Bingöl.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 13)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Bitlis.getLayoutX()-cizgi.getLayoutX()+10,Bitlis.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 14)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Bolu.getLayoutX()-cizgi.getLayoutX()+10,Bolu.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 15)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Burdur.getLayoutX()-cizgi.getLayoutX()+10,Burdur.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 16)
            {
                cizgi.getPoints().addAll(new Double[]{
                        bursa.getLayoutX()-cizgi.getLayoutX()+10,bursa.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 17)
            {
                cizgi.getPoints().addAll(new Double[]{
                        çanakkale.getLayoutX()-cizgi.getLayoutX()+10,çanakkale.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 18)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Çankırı.getLayoutX()-cizgi.getLayoutX()+10,Çankırı.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 19)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Çorum.getLayoutX()-cizgi.getLayoutX()+10,Çorum.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 20)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Denizli.getLayoutX()-cizgi.getLayoutX()+10,Denizli.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 21)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Diyarbakır.getLayoutX()-cizgi.getLayoutX()+10,Diyarbakır.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 22)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Edirne.getLayoutX()-cizgi.getLayoutX()+10,Edirne.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 23)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Elazığ.getLayoutX()-cizgi.getLayoutX()+10,Elazığ.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 24)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Erzincan.getLayoutX()-cizgi.getLayoutX()+10,Erzincan.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 25)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Erzurum.getLayoutX()-cizgi.getLayoutX()+10,Erzurum.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 26)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Eskişehir.getLayoutX()-cizgi.getLayoutX()+10,Eskişehir.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 27)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Gaziantep.getLayoutX()-cizgi.getLayoutX()+10,Gaziantep.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 28)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Giresun.getLayoutX()-cizgi.getLayoutX()+10,Giresun.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 29)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Gümüşhane.getLayoutX()-cizgi.getLayoutX()+10,Gümüşhane.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 30)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Hakkari.getLayoutX()-cizgi.getLayoutX()+10,Hakkari.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 31)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Hatay.getLayoutX()-cizgi.getLayoutX()+10,Hatay.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 32)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Isparta.getLayoutX()-cizgi.getLayoutX()+10,Isparta.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 33)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Mersin.getLayoutX()-cizgi.getLayoutX()+10,Mersin.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 34)
            {
                cizgi.getPoints().addAll(new Double[]{
                        istanbul.getLayoutX()-cizgi.getLayoutX()+10,istanbul.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 35)
            {
                cizgi.getPoints().addAll(new Double[]{
                        İzmir.getLayoutX()-cizgi.getLayoutX()+10,İzmir.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 36)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Kars.getLayoutX()-cizgi.getLayoutX()+10,Kars.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 37)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Kastamonu.getLayoutX()-cizgi.getLayoutX()+10,Kastamonu.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 38)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Kayseri.getLayoutX()-cizgi.getLayoutX()+10,Kayseri.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 39)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Kırklareli.getLayoutX()-cizgi.getLayoutX()+10,Kırklareli.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 40)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Kırşehir.getLayoutX()-cizgi.getLayoutX()+10,Kırşehir.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 41)
            {
                cizgi.getPoints().addAll(new Double[]{
                        kocaeli.getLayoutX()-cizgi.getLayoutX()+10,kocaeli.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 42)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Konya.getLayoutX()-cizgi.getLayoutX()+10,Konya.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 43)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Kütahya.getLayoutX()-cizgi.getLayoutX()+10,Kütahya.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 44)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Malatya.getLayoutX()-cizgi.getLayoutX()+10,Malatya.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 45)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Manisa.getLayoutX()-cizgi.getLayoutX()+10,Manisa.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 46)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Kahramanmaraş.getLayoutX()-cizgi.getLayoutX()+10,Kahramanmaraş.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 47)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Mardin.getLayoutX()-cizgi.getLayoutX()+10,Mardin.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 48)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Muğla.getLayoutX()-cizgi.getLayoutX()+10,Muğla.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 49)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Muş.getLayoutX()-cizgi.getLayoutX()+10,Muş.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 50)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Nevşehir.getLayoutX()-cizgi.getLayoutX()+10,Nevşehir.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 51)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Niğde.getLayoutX()-cizgi.getLayoutX()+10,Niğde.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 52)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Ordu.getLayoutX()-cizgi.getLayoutX()+10,Ordu.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 53)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Rize.getLayoutX()-cizgi.getLayoutX()+10,Rize.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 54)
            {
                cizgi.getPoints().addAll(new Double[]{
                        sakarya.getLayoutX()-cizgi.getLayoutX()+10,sakarya.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 55)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Samsun.getLayoutX()-cizgi.getLayoutX()+10,Samsun.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 56)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Siirt.getLayoutX()-cizgi.getLayoutX()+10,Siirt.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 57)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Sinop.getLayoutX()-cizgi.getLayoutX()+10,Sinop.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 58)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Sivas.getLayoutX()-cizgi.getLayoutX()+10,Sivas.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 59)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Tekirdağ.getLayoutX()-cizgi.getLayoutX()+10,Tekirdağ.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 60)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Tokat.getLayoutX()-cizgi.getLayoutX()+10,Tokat.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 61)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Trabzon.getLayoutX()-cizgi.getLayoutX()+10,Trabzon.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 62)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Tunceli.getLayoutX()-cizgi.getLayoutX()+10,Tunceli.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 63)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Şanlıurfa.getLayoutX()-cizgi.getLayoutX()+10,Şanlıurfa.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 64)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Uşak.getLayoutX()-cizgi.getLayoutX()+10,Uşak.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 65)
            {
                cizgi.getPoints().addAll(new Double[]{
                        van.getLayoutX()-cizgi.getLayoutX()+10,van.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 66)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Yozgat.getLayoutX()-cizgi.getLayoutX()+10,Yozgat.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 67)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Zonguldak.getLayoutX()-cizgi.getLayoutX()+10,Zonguldak.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 68)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Aksaray.getLayoutX()-cizgi.getLayoutX()+10,Aksaray.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 69)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Bayburt.getLayoutX()-cizgi.getLayoutX()+10,Bayburt.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 70)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Karaman.getLayoutX()-cizgi.getLayoutX()+10,Karaman.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 71)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Kırıkkale.getLayoutX()-cizgi.getLayoutX()+10,Kırıkkale.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 72)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Batman.getLayoutX()-cizgi.getLayoutX()+10,Batman.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 73)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Şırnak.getLayoutX()-cizgi.getLayoutX()+10,Şırnak.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 74)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Bartın.getLayoutX()-cizgi.getLayoutX()+10,Bartın.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 75)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Ardahan.getLayoutX()-cizgi.getLayoutX()+10,Ardahan.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 76)
            {
                cizgi.getPoints().addAll(new Double[]{
                        ığdır.getLayoutX()-cizgi.getLayoutX()+10,ığdır.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 77)
            {
                cizgi.getPoints().addAll(new Double[]{
                        yalova.getLayoutX()-cizgi.getLayoutX()+10,yalova.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 78)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Karabük.getLayoutX()-cizgi.getLayoutX()+10,Karabük.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 79)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Kilis.getLayoutX()-cizgi.getLayoutX()+10,Kilis.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 80)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Osmaniye.getLayoutX()-cizgi.getLayoutX()+10,Osmaniye.getLayoutY()-cizgi.getLayoutY()+10
                });
            }if(Bastirilacaksehir[sehirnumara]== 81)
            {
                cizgi.getPoints().addAll(new Double[]{
                        Düzce.getLayoutX()-cizgi.getLayoutX()+10,Düzce.getLayoutY()-cizgi.getLayoutY()+10
                });
            }
            System.out.print(Bastirilacaksehir[sehirnumara]+ " ");
            sehirnumara++;
        }
    }
}
