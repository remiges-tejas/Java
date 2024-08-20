package Abstraction;


interface Human {
    void walk();
}

interface Pet {
    void sings();

    void drinks();
}

interface Animal {
    void eat();

    int LEGS = 4;

    void drinks();
}

class Monkey implements Animal, Pet {


    @Override
    public void eat() {
        System.out.println("Monkey Eating");
    }

    @Override
    public void sings() {
        System.out.println("Singing");
    }


    public void drinks() {
        System.out.println("Monkey is Drinking");
    }
}


public class LearnInterface {
    public static void main(String[] args) {
        Monkey m1 = new Monkey();
        m1.eat();
        m1.sings();
        m1.drinks();

        System.out.println(Animal.LEGS);
    }


}
