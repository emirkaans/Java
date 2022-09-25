import java.sql.SQLOutput;
import java.util.Scanner;

public class KDV {
    public static void main(String[] args)
    {
        //değişkenleri oluştur

        double kdvf, fiyat, kdvt;




//scannerımızı çağırıyoruz
     Scanner inp = new Scanner(System.in);

     System.out.print("Ürün Fiyatını Giriniz : ");
    fiyat = inp.nextDouble();

    kdvf = (fiyat * 118) / 100;
    kdvt = (fiyat * 18) / 100;

        System.out.println("KDV'li Fiyat : " + kdvf);
        System.out.println("KDV Tutarı : " + kdvt);



    } }
