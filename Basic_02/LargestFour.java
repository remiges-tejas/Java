package Basic_02;

public class LargestFour {
    public static void main(String args[]) {
        int a = 1, b = 2, c = 3, d = 4;


//        if (a > b) {
//            System.out.println("A is Greter than b");
//            if (a > c) {
//                System.out.println("A is Greter than c");
//                if (a > d) {
//                    System.out.println("A is greter than d");
//                } else {
//                    System.out.println("D is greter than a");
//                }
//            } else {
//                System.out.println("C is greter than a ");
//            }
//
//        } else {
//            System.out.println("B is Greter than a");
//            if (b > a) {
//                System.out.println("B is greter than a");
//                if (b > c) {
//                    System.out.println("B is greter than c");
//                    if (b > d) {
//                        System.out.println("B is greter than d");
//                    } else {
//                        System.out.println("D is greter than d");
//
//                    }
//                   else{
//                        System.out.println("C is Greter than b");
//                    }
//                   else
//                    {
//                        System.out.println("A is greter than b");
//                        break;
//                    }
//                }
//
//            } else {
//                System.out.println("C is Greter than b");
//            }
//        }
//        if (a > b && a > c && a > d) {
//            System.out.println("A is the Largest Number : " + a);
//        } else if (b > a && b > c && b > d) {
//            System.out.println("B is the largest Number:" + b);
//        } else if (c > a && c > b && c > d) {
//            System.out.println("C is The Largest Number :" + c);
//        } else {
//            System.out.println("D Is The Largest Number :" + d);
//        }

        // Java Ternary Operator
//        condiotion ? exp1 : exp2

        int ab = 19;
        int bc = 22;
        int max;

//        if (ab > bc) {
//
//            max = ab;
//        } else {
//            max = bc;
//        }
//        System.out.println("The Value of Max is :" + max);
//
        // Ternary Opearator
        max = ab > bc ? ab : bc;
        System.out.println("Max is : " + max);
    }

    // Nesting ternary Opearator

    int x = 1;
    int y = 2;
    int z = 3;
    int xyz;

}