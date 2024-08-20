package oops;


class Car {     // Factory

    String Name;
    String Model;
    int price;
    String Color;

    public void run() {
        System.out.println("Car is in Running Mode");
    }

    public void stop() {
        System.out.println("Car is Stopping..");
    }

    void carName() {
        System.out.println(Name + " Car");

    }

}

public class Demo {
    public static void main(String[] args) {

        Car c1 = new Car();

        c1.Name = "BMW";

        c1.carName();
        c1.stop();
        c1.run();


    }

}