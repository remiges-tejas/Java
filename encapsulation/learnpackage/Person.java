package encapsulation.learnpackage;


public class Person {

    // static keyword

     public static int count = 12;

    // Private
    private int age;
    private String Name;
    // it help to avoid the access to the setter Method
    boolean canBeChanged = true;

    public void setAge(int age) {

        // Can Control the access
        if (canBeChanged) {
            if (age > 0)
                this.age = age;
        }


    }

    boolean canBeAccessed = false;

    public int getAge() {
        if (canBeAccessed) {
            return age;
        } else {
            return -1;
        }

    }

}
