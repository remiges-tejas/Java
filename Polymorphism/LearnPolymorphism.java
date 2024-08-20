package Polymorphism;


class Data {

    int data;

    public void printData() {
        System.out.println(data);
    }


    // Method Overloading  [ Compile Time Polymorphism ]
    public void printData(int times) {

        for (int i = 0; i < times; i++) {

            System.out.print(i + " ");
        }

    }
}

class childData extends Data {


    // Run Time Polymorphism
    @Override
    public void printData() {
        System.out.println("Overriden " + data);
    }


}


public class LearnPolymorphism {

//    static void changeValue(int a, Data obj) {
//
//        obj.data = 100;
//        a = 19;
//    }

    public static void main(String[] args) {

        // Runtime Polymorphism  - Method overriding
        Data d;
        d = new childData();
        d.printData();


        // compile Time polymorphism - Method Overloading

        Data d1 = new Data();
        d1.printData(10);

//        changeValue(a, obj);
//        System.out.println(a);
//        System.out.println(obj.data);

    }


}
