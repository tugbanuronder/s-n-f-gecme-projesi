import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int matematik,fizik,turkce,kimya,muzik;

        System.out.println("Matematik notunuzu giriniz:");
        matematik=input.nextInt();
        if(0<=matematik && matematik<=100);
        else {
            matematik=0;
        }
        System.out.println("Fizik notunuzu giriniz:");
        fizik=input.nextInt();
        if(0<=fizik && fizik<=100);
        else {
            fizik=0;
        }
        System.out.println("Turkce notunuzu giriniz:");
        turkce=input.nextInt();
        if(0<turkce && turkce<100);
        else {
            turkce=0;
        }
        System.out.println("Kimya notunuzu giriniz:");
        kimya=input.nextInt();
        if(0<=kimya && kimya<=100);
        else {
            kimya=0;
        }
        System.out.println("Muzik notunuzu giriniz:");
        muzik=input.nextInt();
        if(0<=muzik && muzik<=100);
        else {
            muzik=0;
        }

        double ort= (matematik+fizik+turkce+kimya+muzik)/5;
        if(ort<=55) {
            System.out.println("Sinifta kaldiniz,seneye tekrar gorusmek uzere!");
            System.out.println("Ortalamaniz:"+ort);
        }
        else {
            System.out.println("Tebrikler,sinifi gectiniz!");
            System.out.println("Ortalamaniz:"+ort);
        }

    }

}
