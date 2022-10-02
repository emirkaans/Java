import java.util.Scanner;
public class recursivePrime {

static void asal(int x){
    int counter = 0;
    for(int i=1; i<=x; i++){

        if(x%i==0){
            counter++;
        }
    }

    if(counter==2){
        System.out.println(x + " Bir Asal Sayıdır!");
    }
    else if(counter==1){
        System.out.println(x + " Bir Asal Sayı Değildir!");
    }
    else if(counter>2) {
        System.out.println(x + " Bir Asal Sayı Değildir!" ) ;
    }
    else {
        System.out.println("Hatalı Veri Girişi!");
    }
}
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

        System.out.print("Pozitif Bir Tam Sayı Giriniz : ");
        int input = s.nextInt();

       asal(input);
       
    }
}
