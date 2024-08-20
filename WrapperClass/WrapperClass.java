package WrapperClass;

import java.util.ArrayList;

public class WrapperClass {

    public static void main(String[] args) {

        Integer obj = new Integer(12);

        Integer obj2 = Integer.valueOf("4");
        System.out.println(obj2 * 5);

        Integer obj3 = 13;  // autoboxing

        int age = obj3;     // Unboxing
        Boolean myboolean = Boolean.valueOf(false);


//        ArrayList<int> =new ArrayList<int>();

//        ArrayList<Integer> =new ArrayList<Integer>();
    }

}
