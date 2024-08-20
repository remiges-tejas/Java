package Abstraction.LearnAnonymous;


class OuterClass {

    public void outerMethod() {

    }

}

// Functional InterFace
@FunctionalInterface
interface SuperInterface {
    void InterfaceMethod();
}

public class LearnAnonymous {


    //  ** A SuperClass That an Anpnmyous Class extends **

    // Anonymouus Class Define Here here
    OuterClass obj = new OuterClass() {

        void sing() {
            System.out.println("Singing");
        }

        @Override
        public void outerMethod() {
        }
    };


//    ** Anonymous class using Interface
//    here Anonymous class Impmenetinf Super Interface

    SuperInterface obj1 = new SuperInterface() {
        @Override
        public void InterfaceMethod() {

        }
    };

    // Lambda Expression
    SuperInterface obj3 = () -> {
    };


    public static void main(String[] args) {

        // lambda Expression
        Walkable obj4 = (int steps) ->
        {
            System.out.println("Walked Steps : " + steps);
            return steps;
        };

        obj4.walks(4);

        // Single Statement can  be retunn in single line
        Walkable obj5 = (int steps) -> 2 * steps;
        System.out.println(obj5.walks(5));

    }


}


interface Walkable {

    int walks(int steps);
}

