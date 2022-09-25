import java.util.Scanner;
public class Taksimetre
{
    public static void main(String[] args) {
        double tm, artis, km, sonuc;

        Scanner input = new Scanner (System.in);

        System.out.print("Kilometreyi Giriniz : ");
        km = input.nextDouble();

        artis = km * 6;

        tm = 10 + artis;
        sonuc = (tm <20 ) ? 20 : tm;


        System.out.println("Ücret: " + sonuc);





    }
}
