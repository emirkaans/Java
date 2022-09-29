import java.util.Scanner;
public class recursiveExp {

    static int exp(int a, int n){

        if(n==1){
            return a;

        }
        if(n==0){
            return 1;
        }

        return exp(a,n-1)*exp(a,1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Taban Değeri : ");
        int taban = s.nextInt();
        System.out.print("Üs Değeri : ");
        int us = s.nextInt();

        System.out.println("Sonuç : " + exp(taban,us));

        /* f(2,4)= f(3,2)*f(2,1)
           f(2,3)= f(2,2)*f(2,1)
           f(2,2)= f(2,1)*f(2,1)
           f(2,1)=a
           f(2,0)=1

         */
    }
}
