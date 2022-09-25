import java.util.Scanner;

public class DonguDen
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        for(int i=0; i<7;i++) {

            // f(0)=1, f(1)=2, f(2)=4, f(3)=8, f(4)=16

            System.out.println((int)Math.pow(2,i));

        }


        for(int x=0; x<1; x++){

            System.out.println();
        }

    }

}
