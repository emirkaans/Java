import java.util.Scanner;

public class BasamakToplami
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Sayı : ");
        int number = s.nextInt();
        int total=0;
        int tempNumber=number;
        int basNumber=0;
        int i;
        int basValue;


        while (number != 0){
            number/=10;
            basNumber++;
        }

        number=tempNumber;

            for(i=1; i<=basNumber; i++){
                basValue = number %10;
                number /=10;
                total+=basValue;

            }

        System.out.println(total);
    }


}

