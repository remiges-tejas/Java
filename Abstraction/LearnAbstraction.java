package Abstraction;


abstract class Vehicle {

    abstract void accerate();

    abstract int breaks(int wheels);

    void horn() {
        System.out.println("Vehicle Horns`");
    }


}


class Scooter extends Vehicle {

    @Override
    void accerate() {
        System.out.println("Scooter is Accerating");
    }

    @Override
    int breaks(int wheels) {
        System.out.println("Scooter has only " + wheels + " :wheels");
        return wheels;
    }
}

class Car extends Vehicle {
    @Override
    void accerate() {
        System.out.println("Car is Accerating");

    }

    @Override
    int breaks(int wheels) {
        System.out.println("Car breaks are pushed");
        return wheels;
    }
}


public class LearnAbstraction {
    public static void main(String[] args) {

        Scooter s1 = new Scooter();
        s1.accerate();
        s1.horn();
        s1.breaks(2);


        Car c1 = new Car();
        c1.accerate();
        c1.breaks(4);
        c1.horn();

    }


}
