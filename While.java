import java.util.Scanner;
public class While
{
    public static void main(String[] args) {

        int a = 1, left = 100, right = 200, password;
        boolean isPasswordSuccess = false;

        Scanner inp = new Scanner(System.in);

        //1

        while (a < 7) {
            System.out.println(a);
            a++;
        }

        //2

        while (++left < --right) ;

        System.out.println(left);

    }
}
