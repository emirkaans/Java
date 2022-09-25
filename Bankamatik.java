import java.util.Scanner;
public class Bankamatik
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String userName, password;
        int right=3;
        int balance = 350;
        int back=1;


        while(right>0) {

            System.out.print("Kullanıcı İsmini Giriniz : ");
            userName = s.nextLine();

            System.out.print("Şifrenizi Giriniz : ");
            password = s.nextLine();

            if(userName.equals("taleres") && password.equals("komagene55")){

                System.out.println("Sisteme Başarıyla Giriş Yaptınız!");

                while(back>0) {
                    System.out.println("1)Bakiye Sorgulama\n2)Para Çekme\n3)Para Yatırma\n4)Çıkış ");
                    System.out.print("Yapmak İstediğiniz İşlem Tipini Seçebilirsiniz : ");
                    int choice = s.nextInt();


                    switch (choice) {

                        case 1:
                            System.out.println("Bakiyeniz : " + balance);

                            break;

                        case 2:
                            System.out.print("Çekmek İstediğiniz Tutarı Giriniz : ");
                            int rMoney = s.nextInt();
                            System.out.println("Güncel Bakiyeniz : " + (balance - rMoney) + "TL");

                            break;

                        case 3:
                            System.out.print("Yatırmak İstediğiniz Tutarı Giriniz : ");
                            int gMoney = s.nextInt();
                            System.out.println("Güncel Bakiyeniz : " + (balance + gMoney) + "TL");

                            break;

                        case 4:
                            System.out.println("İyi Günler, Hoşçakalın!");
                            back--;
                            break;


                    }

                }
                    break;


            }
            else{
                right--;
                System.out.println("Hatalı Giriş!");
                System.out.println("Kalan Hakkınız : " + right);

            }
        }


    }
}
