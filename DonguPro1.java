import java.util.Scanner;
public class DonguPro1
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        /* 1)For ile Girilen Sayı ile 0 arasındki 3e ve 4e tam bölünen sayıların ortalaması:


        int x, total=0, tersay=0, sayi=0;
        double ort;

        System.out.print("Lütfen Sayıyı Giriniz : ");
        sayi = s.nextInt();


        for(x=0; x<=sayi; x++){
            if(x%12==0){
                total += x;
                tersay++;
            }

        }
        ort= (total/(tersay-1));
        System.out.println("Sonuç : " + ort);

         */

        int x=0, total=0, sayi=0, adet=0;
        double ort;

        System.out.print("Sayıyı Giriniz : ");
        sayi = s.nextInt();

        while(x<=sayi) {
            x++;
            if (x % 12 == 0) {

                total += x;
                adet++;
            }
        }
        ort = total / (adet-1);

        System.out.println("Sonuç : " + ort);
    }

}
