package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class LearnLists {

    public static void main(String[] args) {


        // Arraylist
        List<Integer> list = new ArrayList<>();

//       List<Integer> list2 = new ArrayList<>();
//      Adding element in list 1
        list.add(10);
        list.add(40);
        list.add(1);
        list.add(1);
        System.out.println(list);
         // get method
        System.out.println(list.get(0));
        // set method
        list.set(1,200);
        System.out.println(list);

         // adding in between element using index
        list.add(2,1000);
        System.out.println(list);
          // remove method which remove element as pet the index
        list.remove(2);
        System.out.println(list);

        // indexof -> which return the value based on index
        System.out.println(list.indexOf(100));
        // last index of

        System.out.println(list.lastIndexOf(10));




        //adding Element in  list 2
//        list2.add(2);
//        list2.add(4);
//        list2.add(6);
//        list2.add(1);

        // addAll
//        list.addAll(list2);
//        System.out.println(list);
        // removeALl
//        list.removeAll(list2);

        // Finding the Intersection
//        list.retainAll(list2);
//        System.out.println(list);


//        System.out.println(list);
//        // siZe
//        System.out.println(list.size());
//        // contains
//        System.out.println(list.contains(20));
//        //remove
//        list.remove(1);
//        System.out.println(list);

        // clear
//
//        System.out.println(list);
//        list.clear();
//        System.out.println(list);
//        Object arr[] = list.toArray();

//        for (Object e : arr) {
//            Integer temp = (Integer) e;
//            System.out.println(temp);
//        }
//        System.out.println(list);
////
////

    }
}
