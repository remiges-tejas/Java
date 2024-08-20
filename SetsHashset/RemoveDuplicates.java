package SetsHashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {

    public static void main(String[] args) {
        // Define the List of string that contains the username
        List<String> usernames = new ArrayList<>();
        // Adding the usernames into the list
        usernames.add("tejasb");
        usernames.add("tejasb");
        usernames.add("tejasb");
        usernames.add("tusharb");
        usernames.add("sumitu");

        // Creating Hashset [Remove the Duplicate Username From the List]
        HashSet<String> findUniqueUsername = new HashSet<>(usernames);
        System.out.println("Unique Usernames:" + findUniqueUsername);




    }
}
