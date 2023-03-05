import java.util.Scanner;

import javax.sound.midi.Soundbank;
public class JavaNot{
    public static void main(String[] args) {
    Scanner inp= new Scanner (System.in)  ;

     System.out.println("mat notunu gir");
    int mat= inp.nextInt();
    System.out.println("fizik notunu gir");
    int fizik= inp.nextInt();
    System.out.println("kimya notunu gir");
    int kimya= inp.nextInt();
     System.out.println("türkçe notunu gir");
    int türkçe= inp.nextInt();
    System.out.println("sosyal notunu gir");
    int sosyal= inp.nextInt();
    System.out.println("müzik notunu gir");
    int müzik= inp.nextInt();

    double sonuc= (mat+fizik+kimya +türkçe+sosyal+müzik)/6;
    boolean durum = sonuc>60;
    String sonDurum =durum ? "gectiniz": "kaldınız";
     
    System.out.println("ortalamanız:   "+ sonuc);
    System.out.println(sonDurum);

    }
}
