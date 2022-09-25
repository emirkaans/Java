import java.util.Scanner;
public class While2
{
    public static void main(String[] args) {

        int password;
        boolean isPas = false;

        Scanner input = new Scanner(System.in);

        while(!isPas){
            System.out.print("Şifrenizi Giriniz : ");
            password = input.nextInt();

            if(password==123){
                System.out.println("Giriş Başarılı! ");
                isPas = true;
            } else {
                System.out.println("Hatalı Giriş, Tekrar Deneyiniz!");
            }
        }


    }
}
