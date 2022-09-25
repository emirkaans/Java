import java.util.Scanner;
public class HesapMakinesi2
{
    public static void main(String[] args) {
        int n1, n2, trch, sonuc;
        Scanner inp = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz : ");
        n1 = inp.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = inp.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("İşlem Tercihiniz : ");
        trch = inp.nextInt();

        if (trch == 1) {
            sonuc = n1 + n2;
            System.out.println("Sonuç :" + sonuc);
        }
        else if (trch == 2) {
            sonuc = n1 - n2;
            System.out.println("Sonuç : " + sonuc);
        }
        else if (trch == 3) {
            sonuc = n1 * n2;
            System.out.println("Sonuç : " + sonuc);
        }
        else if (trch == 4) {
            if (n2==0) {
                System.out.println("Tanımsız Bir İşlem Yaptınız");
            }
            else {
                sonuc = n1 / n2;
                System.out.println("Sonuç : " + sonuc);
            }
        }
        else {
            System.out.println("Geçersiz Bir Sayı Girdiniz. ");

        }

        }

    }

