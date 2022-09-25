import java.util.Scanner;

public class DoWhile
{
    public static void main(String[] args) {
        int password;
        boolean askPassword = true;

        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Şifre Giriniz : ");
            password = inp.nextInt();

            if (password==123) {
                System.out.println("Doğru!");
                askPassword = false;
            }else{
                System.out.println("Hatalı Giriş!");
            }
        } while (askPassword);


    }
}
