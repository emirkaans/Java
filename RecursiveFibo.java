import java.util.Scanner;
public class RecursiveFibo {

    //f(n) = f(n-1) + f(n-2)

    static int f(int n){

        if(n==1 || n==2){
            return 1;
        }

            return f(n - 1) + f(n - 2);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int n = s.nextInt();


        System.out.println("Fibonacci Serisinin " + n + ". Sayısı:  " + f(n));





    }
}
