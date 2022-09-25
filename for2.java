import java.util.Scanner;

public class for2
{
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        int x, y, z;

        System.out.print("Sayı : ");
        x = inp.nextInt();

        for(y=1; y<=x; y*=4){



            System.out.println(y);
        }

        /*for(z=1; z<=x; y*=5){
            System.out.println(z);
        }
        */



    }
}
