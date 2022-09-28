import java.util.Scanner;
public class HrBir
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int N = s.nextInt();

        for(int i=1; i<=10; i++){

            int result = N*i;
            System.out.println(N + " x" + i + " = " + result);

        }
    }
}
