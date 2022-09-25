import java.util.Scanner;

public class WhileEx
{
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int sayi;

        do{
            System.out.print("Şifre Giriniz : ");
            sayi = inp.nextInt();
            System.out.println("Hatalı Giriş!");
        }
        while (sayi>=0);
        System.out.println("Giriş Başarılı!");

         /*

        1)For Örneği

        int i;
        boolean isItOk = false;

        while (!isItOk) {

            System.out.print("Lütfen Negatif Sayı Giriniz : ");
            i = inp.nextInt();

            if (i<0) {
                System.out.println("Hedefe Ulaşıldı!");
                isItOk = true;
            } else {
                System.out.println("Tekrar Deneyiniz!");
            }
        }

        2)While Örneği

        System.out.Print("Sayı Giriniz : ")
        int x = inp.nextInt();

            while (sayi>=0){

            System.out.Print("Sayı Giriniz : ")
            x = inp.nextInt();

            }


          */
    }
}
