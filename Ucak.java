import java.util.Scanner;
public class Ucak
{
    public static void main(String[] args) {
        int yas, tip;
        double km, ucr, ind;

        Scanner inp = new Scanner(System.in);



        System.out.print("Mesafeyi km Cinsinden Giriniz : " );
        km = inp.nextDouble();
        if (km>=0){
            ucr = km * 0.10;
        } else {
            System.out.println("Hatalı Veri Girişi Yaptınız!");
        }
        ucr = (km * 0.10);

        System.out.print("Yaşınızı Giriniz : ");
        yas = inp.nextInt();
        if (yas>=0){
            if(yas<12){
                ucr = (km * 0.10) / 2;
            }
            else if ((yas>=12) && (yas<=24)){
                ucr = (km * 0.10) * (90/100);
            }
            else if (yas>65){
                ucr = (km * 0.10) * (70/100);
            }
        } else {
            System.out.println("Hatalı Veri Girişi Yaptınız!");
        }

        System.out.print("1) Tek Gidiş  2) Gidiş-Dönüş\n Yolculuk Tipini Seçiniz : ");
        tip = inp.nextInt();
        if ((tip==1) || (tip==2)){
            if(tip==2){
                ucr = 2 * ((km * 0.10) * (80/100));
            }
        }
        else{
            System.out.println("Hatalı Veri Girişi Yaptınız!");
        }

        System.out.println("Bilet Ücretiniz : " + ucr );




    }
}
