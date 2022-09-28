import java.util.Scanner;
public class Palindrom {

    static boolean isPalindrom(int number){
        int temp = number, reverseNumber=0, lastNumber;
        while(temp !=0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;

        }

        if(number == reverseNumber)
            return true;
        else
            return false;

        }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Sayı Giriniz : " );
        int x = s.nextInt();

        if(isPalindrom(x)){
            System.out.print(x + " Bir Palindrom Sayısıdır! ");

        } else
            System.out.print(x + " Bir Palindrom Sayısı Değildir! ");

    }
}
