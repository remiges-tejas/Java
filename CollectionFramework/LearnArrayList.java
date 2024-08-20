package CollectionFramework;

import java.util.LinkedList;
import java.util.List;

public class LearnArrayList {

    public static void main(String[] args) {

        List<String> name = new LinkedList<>();
        List<String> stack = new LinkedList<>();


        name.add("Tejas");
        name.add("Tushar");
        name.add("Bisen");

        for (String names : name) {
            System.out.println(names);
        }
    }

}
