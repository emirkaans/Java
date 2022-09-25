import java.util.Scanner;

public class EBOB
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int ebob=0, ekok, a;


        System.out.print("Birinci Sayıyı Giriniz : ");
        int x = s.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        int y = s.nextInt();

        for(a=x; a>=1; a--){

            if (x%a==0 && y%a==0){
                ebob = a;
                break;
                }
            }
        ekok = (x*y) / ebob;
        System.out.println("EBOB : " + ebob);
        System.out.println("EKOK : " + ekok);
        }
    }

