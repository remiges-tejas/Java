package Basic_02;

public class Ifelse {
    public static void main(String[] args) {
//        int age = 4;
//        if (age >= 18) {
//            System.out.println("Congratulations !!");
//            System.out.println("You can Vote");
//
//        } else {
//            System.out.println("Not Eligible For Vote");
//        }
        // if else
//        int day = 2;
//        if (day == 1) {
//            System.out.println("Office");
//        } else if (day == 2) {
//            System.out.println("Villege");
//
//        } else if (day == 3) {
//            System.out.println("Party");
//        } else {
//            System.out.println("Nowhere");
//        }


        // Nested If Else statements

//        Your are give =n three number finde the maximum numbers

        int a = 1;
        int b = 4;
        int c = 11;

        if (a > b) {
            System.out.println("A is bigger than b");
            if (a > c) {
                System.out.println("A is Bigger than c : " + a);
            } else {
                System.out.println("C is Bigger than a");
                System.out.println("C is Largest :" + c);
            }

        } else {
            System.out.println("B is bigger than a");
            if (b > c) {
                System.out.println("B is bigger than  c");
                System.out.println("B is the largest Number :" + b);
            } else {
                System.out.println("C is bigger than a  ");
                System.out.println("C is the largest Number :" + c);
            }

        }
    }

}
