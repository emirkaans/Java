import java.util.Scanner;
public class Recursive {

    static int f(int n) {
        if(n==1){
            return 1;
        }
        return f(n-1) + n;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 1'den n'e kadar olan sayıların toplamı

        System.out.print("Sayı Giriniz : ");
        int n = s.nextInt();

        System.out.println("Sonuç : " + f(n));

    }
}
