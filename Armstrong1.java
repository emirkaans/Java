import java.util.Scanner;
public class Armstrong1
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int number = s.nextInt();

        int b, c, d, e,  basNumber=0, basValue;
        int tempNumber = number;
        int basPow;
        int result=0;


        while(tempNumber !=0){

            tempNumber /= 10;
            basNumber++;
        }

        tempNumber=number;

        while(tempNumber != 0){

            basValue = tempNumber % 10;

            basPow=1;

            for(int i=1; i<=basNumber; i++){
                basPow *= basValue;
            }

            result += basPow;
            tempNumber /= 10;


        }
    }
}
