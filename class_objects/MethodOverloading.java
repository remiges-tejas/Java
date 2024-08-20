package oops;

public class MethodOverloading {

    public static void main(String[] args) {
        Greet g1 = new Greet();
        g1.greting();
        g1.greting("Tejas", 10);
    }
}

class Greet {
    void greting() {
        System.out.println("Good Morning");
    }


    void greting(String name, int count) {

        for (int i = 0; i < count; i++) {
            System.out.println("Good Morning  " + name);


        }


    }


}
