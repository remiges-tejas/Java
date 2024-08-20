package WrapperClass;

public class GenericMethod {

      // Generic Method
    static <E> void printData(E data)
    {
        System.out.println(data);

    }

    public static void main(String[] args) {

        System.out.println("Hello");
        printData("Tejas ");
        printData(123);
        printData(false);


    }
}
