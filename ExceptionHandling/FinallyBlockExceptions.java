package ExceptionHandling;

public class FinallyBlockExceptions {

    public static int getNumberfromArray(int arr[]) throws ArithmeticException {
        return arr[8];
    }

    public static void main(String[] args) {

        int arr[] = new int[5];
        try {
            getNumberfromArray(arr);
        } catch (Exception e) {

            System.out.println("Catche the Excepotion :  " + e);
        }


//        System.out.println("Hello World");

//        try {
//            System.out.println(arr[3]);
//        } catch (Exception e) {
//            System.out.println("Exception Handle");
//        } finally {
//            System.out.println("I will Run always ");
//        }
//
//        System.out.println("Bye World");


    }
}
