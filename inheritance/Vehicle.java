package inheritance;


public class Vehicle {

    // Parent Class Variable
    int wheelsCount;
    String Model;

    //Method Of parent Class
    void start() {
        System.out.println("Vehicle is Starting");
    }

    void getName() {
        System.out.println("Tejas Bisen");
    }

    // Constrctor of Parent Class

    public Vehicle() {
        System.out.println("Parent Class Constructor called");
    }

//    public Vehicle(int wheelsCount) {
//        this.wheelsCount = wheelsCount;
//        System.out.println("Creating vehicle with  wheeelcount");
//    }

    final int gears = 5;

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
//        v.gears = 4;
        System.out.println(v.gears);

    }

}
