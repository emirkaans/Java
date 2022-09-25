public class ConBreak
{
    public static void main(String[] args) {

        int i;

        //0'Dan 10'a kadar olan sayılardan 5'i ekrana yazdırma:

        for (i = 0; i <= 10; i++) {

            if (i == 5) {
                continue;
            }

            System.out.println(i);


        }

        System.out.println("------------");
        // 1'den 10'a kadar tek sayıları yazdır:

        for (i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);
        }

        System.out.println("------------");

        //1den 10'a kadar tek sayıları While ile yazdır:

        int x = 0;

        while (x <= 9) {

            x++;
            if (x % 2 == 0) {

                continue;
            }

            System.out.println(x);
        }

        System.out.println("------------");

        for(i=1; i<=2; i++){
            for(int j=1; j<4; ++j){
                if(i==1) continue;
                System.out.print(i+j);
            }
        }

    }
}
