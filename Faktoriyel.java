import java.util.Scanner;

public class Faktoriyel
{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int a, b=1, total=1;

        System.out.print("Sayı Giriniz : ");
        a = inp.nextInt();

        for(b=1; b<=a; b++){

            total*=b;


        }
        System.out.print(total);
    }
}
