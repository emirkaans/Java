public class AsalSayi
{
    public static void main(String[] args) {

        for(int i=2; i<=100; i++){

            boolean x = true;

            for (int j=2; j<i; j++) {

                if(i%j==0){
                    x = false;
                    break;
                }
            }
            if(x){
                System.out.println(i);
            }
        }
    }
}
