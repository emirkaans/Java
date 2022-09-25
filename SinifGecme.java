import java.util.Scanner;
public class SinifGecme
{
    public static void main(String[] args) {
        double mat, fizik, turkce, kimya, muzik, ort, tn=0, ds=0;

        Scanner inp = new Scanner (System.in);

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = inp.nextDouble();
        if((mat>=0) && (mat<=100)) {
            tn += mat;
            ds++;

        }

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = inp.nextDouble();
        if ((fizik>=0) && (fizik<=100)) {
            tn += fizik;
            ds++;
        }

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = inp.nextDouble();
        if ((turkce>=0) && (turkce<=100)){
            tn += turkce;
            ds++;
        }

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = inp.nextDouble();
        if ((kimya>=0) && (kimya<=100)) {
            tn += kimya;
            ds++;
        }

        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = inp.nextDouble();
        if ((muzik>=0) && (muzik<=100)){
            tn += muzik;
            ds++;
        }

        ort = tn / ds;

        if (ort<55) {
            System.out.println("Ortalamanız : " + ort);
            System.out.println("Sınıfta Kaldınız");
        }
        else if ((ort>=55) && (ort<=100)){
            System.out.println("Ortalamanız : " + ort);
            System.out.println("Tebrikler! Sınıfı Geçtiniz");
        }
        else {
            System.out.println("Yanlış Değerler Girdiniz!");
        }
    }
}
