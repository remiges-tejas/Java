package Basic_02;

public class NestedLoop {

    public static void main(String[] args) {


//        for (int count = 0; count < 10; count++) {
//
//            for (int i = 1; i < 6; i++) {
//                System.out.print(i + " ");
//            }
//            System.out.println("Printed " + count);
//
//        }
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }

    }
}
