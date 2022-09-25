import java.util.Scanner;

public class Hipotenus
{
    public static void main(String[] args) {


    //değişkenler
    double a, b, c;
//scannerımızı çağırdık
    Scanner inp = new Scanner(System.in);

        System.out.print("Birinci Kenarı Giriniz : ");
        a = inp.nextDouble();

        System.out.print("İkinci Kenarı Giriniz : ");
        b = inp.nextDouble();

         c = (a*a) + (b*b);





        System.out.println("Hipotenüs : " + Math.sqrt(c));







} }
