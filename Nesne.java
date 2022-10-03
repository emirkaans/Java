public class Nesne {
    public static void main(String[] args) {
        Car audi = new Car();

        audi.model = "Audi";
        audi.speed = 10;
        audi.increaseSpeed(10);
        audi.decreaseSpeed(5);
        audi.printSpeed();

        Car bmw = new Car();

        bmw.model = "BMW";
        bmw.speed = 15;
        bmw.increaseSpeed(60);
        bmw.decreaseSpeed(20);
        bmw.printSpeed();

        Car mercedes = new Car();

        mercedes.model = "Mercedes";
        mercedes.speed = 20;
        mercedes.increaseSpeed(80);
        mercedes.decreaseSpeed(20);
        mercedes.printSpeed();
    }
}
