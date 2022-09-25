import java.util.Scanner;
public class ArtikYil
{
    public static void main(String[] args) {
        int yil;
        Scanner inp = new Scanner(System.in);

        System.out.print("Yılı Giriniz : ");
        yil = inp.nextInt();

        if (yil%4==0) {
            if(yil%100==0){
                if(yil%400==0){
                    System.out.println(yil + " Artık Bir Yıldır! (1)");
                }else{
                    System.out.println(yil + " Artık Bir Yıl Değildir! (2)");
                }

            } else if (yil%4==0){
                System.out.println(yil + " Artık Bir Yıldır! (3)");
            }

        } else {
            System.out.println(yil + " Artık Bir Yıl Değildir! (4)");
        }
    }
}
