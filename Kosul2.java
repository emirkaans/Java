public class Kosul2 {
    public static void main(String[] args) {

       float a= 0.9f;

       if(a>=0.8){
           System.out.println("Yüksek Tuzlu");


       }
       else if(0.5 < a && a < 0.8) {
           System.out.println("Orta Tuzlu");
       }
        else{

           System.out.println("Düşük Tuzlu");
       }

        int age=18, weight=45;

        if(age>=18){
            if(weight>=45){
                System.out.println("Kan Verebilirsiniz");
            }
            else{
                System.out.println("Kan Veremezsiniz");
            }
        }
        else{
            System.out.println("Yaşınız Tutmadığı İçin Kan Veremezsiniz");
        }

    }
}
