import java.util.Scanner;
public class recursivePower {

    static int f(int a, int n){

        if(n==1){
            return a;
        }

        return f(a,n-1)*f(a,1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Taban Değeri : ");
        int taban = s.nextInt();
        System.out.print("Üs Değeri : ");
        int us = s.nextInt();

        System.out.println("Sonuç : " + f(taban,us));

        /* f(2,4)= f(3,2)*f(2,1)
           f(2,3)= f(2,2)*f(2,1)
           f(2,2)= f(2,1)*f(2,1)
           f(2,1)=a
           f(2,0)=1

         */
    }
}
