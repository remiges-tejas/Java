package encapsulation.package2;

// Importing Custom Class

import encapsulation.learnpackage.Teacher;

public class MainInPackege2 extends Teacher {

    public static void main(String[] args) {

        Teacher obj = new Teacher();

        // Main Package
        MainInPackege2 obj1 = new MainInPackege2();
        obj1.studentCount = 3;

    }
}
