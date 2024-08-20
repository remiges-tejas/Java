package ExceptionHandling;

import java.sql.Array;
import java.sql.SQLOutput;

public class LearnException {

    public static void main(String[] args) {

        int a[] = new int[5];
        System.out.println("Executed Exception");

        // try catch Exception  [ Multiple Catch Can be used with the try block ]
//        try {
//            int result = 5 / 0;
//
//            System.out.println(result);
//
//            System.out.println(a[8]);
//
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//
//
//            System.out.println("Try to except : Array out of bound ");
//        } catch (ArithmeticException e) {
//            System.out.println(e.getMessage());
//            System.out.println(e.getStackTrace());
//            System.out.println(e);
//            System.out.println(e);
//        }


        try {
            int result = 5 / 0;
            System.out.println(result);
            System.out.println(a[8]);
        } catch (Exception e) {
            System.out.println(e);
        }

//        catch (ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e) {
//            System.out.println("Handling The Exception  ");
//        } catch (RuntimeException e) {
//            System.out.println(e);
//        }

        System.out.println("Stop Execution ");
    }
}
