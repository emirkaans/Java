import java.util.Scanner;

public class Manav
{
    public static void main(String[] args) {
        double arm, elma, dom, muz, pat, total;

        Scanner inp = new Scanner (System.in);

        System.out.print("Armut kg giriniz : ");
        arm = inp.nextDouble();

        System.out.print("Elma kg giriniz : ");
        elma = inp.nextDouble();

        System.out.print("Domates kg giriniz : ");
        dom = inp.nextDouble();

        System.out.print("Muz kg giriniz : ");
        muz = inp.nextDouble();

        System.out.print("Patlıcan kg giriniz : ");
        pat = inp.nextDouble();

        total = (arm * 14) + (elma * 8) + (dom * 10) + (muz * 35) + (pat * 11);

        System.out.println("Toplam Fiyat : " + total);


    }
}
