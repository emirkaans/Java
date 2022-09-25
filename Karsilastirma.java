import java.util.Scanner;
public class Karsilastirma {
    public static void main(String[] args) {
        double a = 10, b = 20, c = 10, d = 40;

        Scanner inp = new Scanner(System.in);

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println((a*2) == b);
        System.out.println(a+c <= b);
        System.out.println(a==b || a==c);
        System.out.println(a==b && a==c);
        System.out.println(!(a==c));


        int x=10, y=20, z;

        z = (x>=y)? 45: 50;

        System.out.println("Z'nin değeri : " + z);



        boolean t, f;

        t =  true;
        f = false;

        System.out.println(t && f);
        System.out.println(t || f);














    }
}
