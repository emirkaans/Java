import java.util.Scanner;
public class MinMax
{
    public static void main(String[] args) {


        int min=0,max=0,sayi,n;

        Scanner inp=new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz ?");
        n=inp.nextInt();

        for(int i=0;    i<n;    i++){
            System.out.println("N"+i+":");
            sayi=inp.nextInt();
            if(i==0){
                min=sayi;
                max=sayi;
            }
            if(sayi<min){
                min=sayi;
            }if (sayi>max) {
                max=sayi;
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);


    }
}
