import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a=2, b=5;

        switch (a){

            case 1:
                System.out.println("Birdir");
                break;
            case 3:
                System.out.println("Üçtür");
                break;
            default:
                System.out.println("İkidir");

        }

        switch (b){

            case 7:
                System.out.println("Yedidir");
                break;
            case 5:
                System.out.println("Beştir");
                break;
            default:
                System.out.println("Ondur");
        }
    }
}
