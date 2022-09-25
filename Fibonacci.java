import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int n = s.nextInt();
        int a = 1;
        int b = 1;
        int c;
        System.out.println("0");
        System.out.println(a);
        System.out.println(b);
        for(int i=0; i<n-3; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
}
