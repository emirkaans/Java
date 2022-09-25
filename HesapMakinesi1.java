import java.util.Scanner;
public class HesapMakinesi1
{
    public static void main(String[] args) {
        int n1, n2, trch;
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = inp.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        n2= inp.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");

        System.out.print("Tercihiniz : ");
        trch = inp.nextInt();

        switch (trch) {
            case 1:
                trch = n1 + n2;
                System.out.println("Sonuç : " + trch);
                break;
            case 2:
                trch = n1 - n2;
                System.out.println("Sonuç :" + trch);
                break;
            case 3:
                trch = n1 * n2;
                System.out.println("Sonuç :" + trch);
                break;
            case 4:
                switch (n2) {
                    case 0:
                        System.out.println("Tanımsız Bir İşlem Yaptınız.");
                        break;
                    default:
                trch = n1 / n2;
                System.out.println("Sonuç :" + trch);
                    }
                break;
            default:
                System.out.println("Geçersiz Bir Sayı Girdiniz.");

        }

    }

}
