import java.util.Scanner;
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
    
    double sonuç= (mat+fizik+kimya +türkçe+sosyal+müzik)/6;
    System.out.println("ortalamanız:   "+ sonuç);

    }
}
