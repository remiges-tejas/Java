package Abstraction;


// Inner class Mostly used for Reusability of code
public class LearnInnerClass {

    class Subinner {
        int age = 13;

    }

    static class Playstation {
        int price = 999;


    }


    public static void main(String[] args) {
        // Calling Sub class with The Help Of MainClass Here
        LearnInnerClass m1 = new LearnInnerClass();
        Subinner s1 = m1.new Subinner();
        s1.age = 34;

        // Same goes with the Static Inner Class
        Playstation playstation = new LearnInnerClass.Playstation();

    }
}
