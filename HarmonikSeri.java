import java.util.Scanner;

public class HarmonikSeri
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Sayıyı Giriniz : ");
        double num = s.nextDouble();
        double i;
        double x=0;

        for(i=1; i<=num; i++){
            x+=1/i;
        }

        System.out.println("Sonuç : " + x);
    }
}
