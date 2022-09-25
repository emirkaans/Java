import java.util.Scanner;
public class Login
{
    public static void main(String[] args) {
        String userName, password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("Taleres") && password.equals("komagene55")) {
            System.out.println("Başarıyla Giriş Yaptınız!");
        }
        else {
            System.out.println("Hatalı Kullanıcı Adı veya Şifre");

        }
    }
}
