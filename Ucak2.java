import java.util.Scanner;

public class Ucak2
{
    public static void main(String[] args) {

        // km=mesafe, nt=normal tutar, yio=yaş indirim oranı, yif=yaş indirimli fiyat

        double km, nt, yio, yif, total;
        int yas, tip;

        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi km Cinsinden Giriniz : ");
        km = inp.nextDouble();

        System.out.print("Yaşınızı Giriniz : ");
        yas = inp.nextInt();

        System.out.print("1)Tek Gidiş  2)Gidiş-Dönüş\nYolculuk Tipini Seçiniz : ");
        tip = inp.nextInt();

        nt = km * 0.10;


        if (km>0) {

            if ((yas >= 0) && (yas < 12)) {
                yio = 0.5;
            } else if ((yas >= 12) && (yas < 24)) {
                yio = 0.9;
            } else if ((yas >= 24) && (yas < 65)) {
                yio = 1;
            } else if (yas > 65) {
                yio = 0.7;
            } else {
                yio = 0;
            }

            yif = nt * yio;

            if (tip == 1) {
                total = yif;
            } else if (tip == 2) {
                total = (yif * 0.8) * 2;
            } else {
                total = 0;
            }

            if ((total==0) || (yio==0)) {

                System.out.println("Hatalı Veri Girdiniz! ");
            }

            else {
                System.out.println("Ücret : " + total);
            }
        }
        else {
            System.out.println("Hatalı Veri Girdiniz! ");
        }
    }
}
