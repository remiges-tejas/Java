package ExceptionHandling;


import java.util.Scanner;

class MyException extends Exception {

    public MyException(String mesage) {
        super(mesage);
    }

}

public class CustomException {


    public static void main(String[] args) throws MyException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");

        try {
            int age = sc.nextInt();
            if (age > 100) {
//                throw new MyException("My Eror is this");
                throw new ArithmeticException("More than 100 is not Allowed");

            }

        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
