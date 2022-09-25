import java.sql.SQLOutput;
import java.util.Scanner;


public class Hesap
{
    public static void main(String[] args) {

        // Değişkenleri oluştur

        int mat, fizik, kimya, turkce, tarih, muzik;
        double ortalama;
        String sonuc;

        //scanner sınıfımızı tanımladık

        Scanner inp = new Scanner(System.in);

        //kullanıcıdan değerleri al

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik =  inp.nextInt();

        ortalama = (mat + fizik + kimya + turkce + tarih + muzik)/6.0;
        sonuc = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";



        System.out.println("Ortalamanız : " + ortalama+"\nGeçme Durumu : " + sonuc );







    }
}
