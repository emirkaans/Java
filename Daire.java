import java.util.Scanner;
public class Daire
{
    public static void main(String[] args) {

        double pi, r, alan, cevre, angle, ialan;
        Scanner inp = new Scanner(System.in);

        System.out.print("Yarıçapı Giriniz: ");
        r = inp.nextDouble();


        pi = 3.14;
        cevre = 2 * pi * r;
        alan = pi * r * r;

        System.out.println("Çevre : " + cevre);
        System.out.println("Alan : " + alan);

        System.out.print("Açıyı giriniz : ");
        angle = inp.nextDouble();

        ialan = (pi * (r*r) * angle) / 360;

        System.out.println("İkinci Alan: " + ialan);






    }
}
