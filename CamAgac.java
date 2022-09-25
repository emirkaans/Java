import java.util.Scanner;

public class CamAgac
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int num = s.nextInt();

        for(int i=1; i <= num; i++){

            for(int k=1; k<= (num-i); k++){
                System.out.print(" ");
            }

            for(int j=1; j<= (2*i) -1 ; j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
