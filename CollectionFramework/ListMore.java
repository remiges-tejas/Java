package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListMore {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        fruits.add("KIWI");
        fruits.add("Apple");
        fruits.add("Bananas");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("blueberry");

//        using  iterator

//        Iterator<String> fe = fruits.iterator();
//       while(fe.hasNext())
//       {
//           System.out.println(fe.next());
//       }

        //  only specific to the list to itraste the list element
//        Iterator<String> fe = fruits.listIterator();
//        while (fe.hasNext()) {
//            System.out.println(fe.next());
//        }

        List<String> smallList = fruits.subList(1, 4);

        for (String fre : smallList) {
            System.out.print(fre + " ");
        }








       /*  // iterating element  using for loop
        for (int i = 0; i <fruits.size() ; i++) {
            System.out.println(fruits.get(i));
        }
          // iterating the element using for each
        for( String fru : fruits)
        {
            System.out.print(fru + " ");
        } */


    }
}
