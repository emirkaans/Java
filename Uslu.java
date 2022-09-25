import java.util.Scanner;
public class Uslu
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a, b, i, j, total=1;

        System.out.print("Sayıyı Giriniz : ");
        a= s.nextInt();

        System.out.print("üssünü Giriniz : ");
        b = s.nextInt();

        for(i=1; i<=b; i++){

            total*=a;
        }
        System.out.print(total);
    }
}
