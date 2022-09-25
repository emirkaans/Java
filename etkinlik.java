import java.util.Scanner;
public class etkinlik
{
    public static void main(String[] args) {
        int isi;
        Scanner inp = new Scanner(System.in);
        System.out.print("Hava Sıcaklığını Giriniz : ");
        isi = inp.nextInt();

        if (isi<5) {
            System.out.println("Kayak Yapabilirsiniz");
        }
        else if ((isi>=5) && (isi<25)){
            if (isi<=15){
                System.out.println("Sinemaya Gidebilirsiniz");
            }
            if (isi>=10){
                System.out.println("Pikniğe Gidebilirsiniz");
            }
        }
        else {
            System.out.println("Yüzmeye Gidebilirsiniz");
        }
    }
}
