class Car {

    //Nitelikler

    String type;
    String model;
    String color;
    int speed;
    int speedLimit=180;

    //Davranışlar

    void increaseSpeed(int increment){

        if((speed + increment) <= speedLimit){
            speed+=increment;
        }
    }
    int decreaseSpeed(int decrease){
        if(speed>0){
            speed-=decrease;
        }
        return speed;
    }

    void printSpeed(){
        System.out.println(model + " Hız : " + speed);
    }
}
