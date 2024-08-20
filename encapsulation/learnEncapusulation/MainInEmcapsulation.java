package encapsulation.learnEncapusulation;

import encapsulation.learnpackage.Person;

public class MainInEmcapsulation {

    // Static Method
    public static void printHello() {
        System.out.println("Hello");
    }

    // Non-static Methods
    public void printHi() {
        System.out.println("Hi`");
        printHello();


    }

    public static void main(String[] args) {

        //
//        Person p1 = new Person();
//        p1.setAge(-1);
//        System.out.println(p1.getAge());
//        // Accesign=ng the static Member
////        System.out.println(Person.count);
//        Person p2 = new Person();
//        p2.count = 45;
//        System.out.println(Person.count);
//        System.out.println(Math.max(2, 5));\
        MainInEmcapsulation m1 = new MainInEmcapsulation();
        m1.printHi();

    }
}
