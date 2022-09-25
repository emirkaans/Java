import java.util.Scanner;

public class Kombinasyon
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a,b,c,n, r, cfak=1,nfak=1, rfak=1, son;

        System.out.print("Birinci Sayıyı Giriniz : ");
        n = s.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        r = s.nextInt();

        for(a=1; a<=n; a++){

            nfak*=a;
        }

        for (b=1; b<=r; b++){
            rfak*=b;
        }

        for(c=1; c<=(n-r); c++){
            cfak*=c;

        }

        son= nfak/(rfak*cfak);

        System.out.println("Cevap : " + son);
    }
}
