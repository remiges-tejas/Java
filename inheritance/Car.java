package inheritance;


public class Car extends Vehicle {

    // Defining the Varible In child Class
    String color;


    //Defining Method  the Child Class
    void start() {
        super.start();
        System.out.println("Car is Starting");
    }

    // Defining the Constructor For the child Class

//    public Car() {
//        super(3);
//        System.out.println("Car Constructor is being Created");
//    }

    // Calling Main Method where execution Start
    public static void main(String[] args) {
        Car c1 = new Car();
         System.out.println(c1.wheelsCount);

        c1.wheelsCount = 4;
        c1.Model = "I10";
        c1.color = "Red";
        c1.start();
        c1.getName();
        System.out.println(c1.wheelsCount);
    }
}
