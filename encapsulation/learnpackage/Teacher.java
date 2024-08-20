package encapsulation.learnpackage;

public class Teacher {

    // public
    public int teachingClass;
    // private  [not accesable ]
    private int id;
    //default
    String degree;

    //Protected

    protected int studentCount;


    // Main Method
    public static void main(String[] args) {
        Teacher obj = new Teacher();
        obj.teachingClass = 12;
        obj.id = 123;
    }

}
