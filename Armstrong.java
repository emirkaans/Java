import java.util.Scanner;

public class Armstrong
{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Sayı : ");
        int number = s.nextInt();
        int basNumber=0;
        int tempNumber=number;
        int basValue;
        int result=0;
        int basPow;

        while (tempNumber!=0){
            tempNumber/=10;
            basNumber++;
        }

        tempNumber = number;
        while (tempNumber !=0){
            basValue=tempNumber % 10;

            basPow=1;

            for(int i = 1; i<=basNumber; i++){
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;

        }
            if(result==number) {
                System.out.println(number + " Sayısı Bir Armstrong Sayısıdır! ");
            } else {
                System.out.println(number + " Sayısı Bir Armstrong Sayısı Değildir! ");
            }






    }
}
