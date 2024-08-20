package SetsHashset;

import java.util.HashSet;

public class CheckRole {

    public static void main(String[] args) {

        HashSet<String> roles = new HashSet<>();

        roles.add("Admin");
        roles.add("User");
        roles.add("Guest");

        String roleToCheck = "Admin";
         // containes method used()
        if(roles.contains(roleToCheck))
        {
            System.out.println( roleToCheck + "Role exists");
        }
        else {
            System.out.println( roleToCheck + "Role does not exists");

        }



    }
}
