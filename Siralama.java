import java.util.Scanner;
public class Siralama
{
    public static void main(String[] args) {

        int n1, n2, n3;

        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz : ");
        n1 = inp.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = inp.nextInt();

        System.out.print("Üçüncü Sayıyı Giriniz : ");
        n3 = inp.nextInt();

        if ((n1<n2) && (n2<n3)){
            System.out.println(n1 +  "-" + n2  + "-" + n3);

        }
        else if ((n1<n2) && (n3<n2)){
            if(n1<n3){
                System.out.println(n1 + "-" + n3 + "-" + n2);
            }
            else {
                System.out.println(n3 + "-" + n1 + "-" + n2);
            }
        }
        else if ((n3<n2) && (n2<n1)){
            System.out.println(n3 + "-" + n2 + "-" + n1);
        }
        else if ((n2<n3) && (n2<n1)){
            if(n1<n3){
                System.out.println(n2 + "-" + n1 + "-" + n3);
            }
            else {
                System.out.println(n2 + "-" + n3 + "-" + n1);
            }
        }
    }

}
