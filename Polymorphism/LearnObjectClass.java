package Polymorphism;


class Car {
    String model;
    int year;


    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }


    // Overding toString Method from object class

    @Override
    public String toString() {

        return "Car ka Model : " + model + " : And Year is :" + year;

    }


    // Cheack whether obj is true or false
    @Override
    public boolean equals(Object obj) {

        Car that = (Car) obj;

        if (this.model.equals(that.model) && this.year == that.year) {
            return true;
        }

        return false;
    }


    // Implementing HashCode Method


    @Override
    public int hashCode() {
        int intialNum = 31;
        intialNum += year;
        intialNum += model.hashCode();
        return intialNum;

    }

}

public class LearnObjectClass {

    public static void main(String[] args) {

        Car c1 = new Car("Honda", 2023);
        Car c2 = new Car("Honda", 2023);

        System.out.println(c1); // defualt toString Method From
        System.out.println(c2);

        // Cheacking Two Above object whether same or not
        // return false
        System.out.println(c1.equals(c2));

        System.out.println(c1.hashCode());
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }


}
