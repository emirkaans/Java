import java.util.Scanner;
public class Burc
{
    public static void main(String[] args) {

        int gun;
        String ay;

        Scanner inp = new Scanner(System.in);

        System.out.print("Ayı Giriniz : ");
        ay = inp.nextLine();

        System.out.print("Günü Giriniz : ");
        gun = inp.nextInt();

        if ((ay.equals("Mart") && (gun>=21)) || ((ay.equals("Nisan") && (gun<21)))){

            System.out.println("Burcunuz : Koç ");
        }
        else if ((ay.equals("Nisan") && (gun>=21)) || ((ay.equals("Mayıs") && (gun<=21)))){
            System.out.println("Burcunuz : Boğa");
        }
        else if ((ay.equals("Mayıs") && (gun>=22)) || ((ay.equals("Haziran") && (gun<=22)))){
            System.out.println("Burcunuz : İkizler");
        }
        else if ((ay.equals("Haziran") && (gun>=23)) || ((ay.equals("Temmuz") && (gun<=22)))){
            System.out.println("Burcunuz : Yengeç");
        }
        else if ((ay.equals("Temmuz") && (gun>=23)) || ((ay.equals("Ağustos") && (gun<=22)))){
            System.out.println("Burcunuz : Aslan");
        }
        else if ((ay.equals("Ağustos") && (gun>=23)) || ((ay.equals("Eylül") && (gun<=22)))){
            System.out.println("Burcunuz : Başak");
        }
        else if ((ay.equals("Eylül") && (gun>=23)) || ((ay.equals("Ekim") && (gun<=22)))){
            System.out.println("Burcunuz : Terazi");
        }
        else if ((ay.equals("Ekim") && (gun>=23)) || ((ay.equals("Kasım") && (gun<=21)))){
            System.out.println("Burcunuz : Akrep");
        }
        else if ((ay.equals("Kasım") && (gun>=22)) || ((ay.equals("Aralık") && (gun<=21)))){
            System.out.println("Burcunuz : Yay");
        }
        else if ((ay.equals("Aralık") && (gun>=22)) || ((ay.equals("Ocak") && (gun<=21)))){
            System.out.println("Burcunuz : Oğlak");
        }
        else if ((ay.equals("Ocak") && (gun>=22)) || ((ay.equals("Şubat") && (gun<=19)))){
            System.out.println("Burcunuz : Kova");
        }
        else if ((ay.equals("Şubat") && (gun>=20)) || ((ay.equals("Mart") && (gun<=20)))){
            System.out.println("Burcunuz : Balık");
        }
        else {
            System.out.println("Yanlış Değer Girdiniz");
        }

    }
}
