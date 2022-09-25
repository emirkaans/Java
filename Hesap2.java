import java.util.Scanner;
public class Hesap2
{
    public static void main(String[] args) {
        //değişkenlerimizi atayalım
        int mat , turkce, fizik, kimya, tarih;
        String sonuc;
        double ortalama;

        Scanner inp = new Scanner (System.in);

        System.out.print("Matematik Notunuz : ");
        mat = inp.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = inp.nextInt();

        ortalama = (mat + turkce + fizik + kimya + tarih) / 5.0;
        sonuc = (ortalama > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println("Not Ortalamanız :" + ortalama +" \nGeçme Durumu: " + sonuc);


    }
}
