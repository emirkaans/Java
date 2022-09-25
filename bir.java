import java.util.Scanner;
public class bir
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int x, y, total=0;

        System.out.print("Sayı : ");
        x = s.nextInt();

        for(y=0; y<=x; y++){
            if(y%4==0){
                total+=y;
            }
        }
        System.out.println(total);
    }
}
