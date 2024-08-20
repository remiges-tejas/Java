package WrapperClass;


import java.util.ArrayList;

class Dog <E> {

    E id;

    public Dog(E id) {
        this.id = id;
    }

    E getId()
    {
        return id;
    }

}

public class Generics {

    public static void main(String[] args) {

        // Genrics
         Dog<String> d1 = new Dog<> ("123Lasa");
         Dog<String> d2 = new Dog<String>("3434Labra");
         Dog<Integer> d3 = new Dog<Integer>(13);

        System.out.println(d1.getId());


//        ArrayList<Integer= new ArrayList<>();

//        Dog d1 = new Dog("123Lasa");
//        Dog d2 = new Dog("232sd");
//        Dog d3 = new Dog(13);  //  Encountetr this prbm using genreics

    }
}
