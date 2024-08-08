package Methods;

import com.sun.security.jgss.GSSUtil;

public class BasicOfMethods {

//
//    public static int sum(int x, int y) {
//        return x + y;
//    }

//    public void printHello() {
//        System.out.println("Hello World");
//    }
//    public static void Greet() {
//        System.out.println("Good Morning");
//        System.out.println("Good Afternoon");
//        System.out.println("Good Evening");
//        System.out.println("Good Night");
//    }

//    without Return Type
//    public static void avarage(int a, int b) {
//        int avg = (a + b) / 2;
//        System.out.println("The Avrage is  : " + avg);
//    }


    // With Return Type
    public static int avarage(int a, int b, boolean canDo) {

        if (canDo == false) {
            return -1;
        }

        int avg = (a + b) / 2;
        return avg;
    }


    public static void main(String[] args) {
        // Methods Basic Introdution
        // ***Sum of Two Number
//        int res = sum(8, 2);
//        System.out.println("Sum is :" + res);
//        BasicOfMethods b1 = new BasicOfMethods();
//        b1.printHello();
        // *** Avrage Method
//        int result = avarage(5, 5);
//        System.out.println("AVRAGE IS :" + result);
//        System.out.println(1);
//        System.out.println(2);
//        Greet();
//        System.out.println(3);
//
        int avg = avarage(50, 50, true);
        System.out.println("The Avrage of Two Num is :" + avg);

        System.out.println(avarage(9, 3, false));

    }

}
