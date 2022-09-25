import java.util.Scanner;
public class Endeks {
    public static void main(String[] args) {
    double kg, weight, index;
    Scanner inp = new Scanner(System.in);
        System.out.print("Kilonuzu Giriniz : " );
        kg = inp.nextDouble();

        System.out.print("Boyunuzu Giriniz : " );
        weight = inp.nextDouble();

        index = kg / ((weight * weight) / 10000);

        System.out.println("Vücut Kitle Endeksiniz : " + index);



    }
}
