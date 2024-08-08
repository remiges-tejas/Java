package oops;


class Complex {
    int a, b;

    void print() {
        System.out.println(a + " + " + b + "i");
    }

    // Defining The Constructor

    public Complex(int real, int imaginary) {
        a = real;
        b = imaginary;
    }

    public Complex(int real) {
        a = real;
        b = 12;
    }
}


public class LearnConstructor {
    public static void main(String[] args) {

        // Default Constructor Called
        Complex c1 = new Complex(2, 1);
        Complex c2 = new Complex(6);

        // calling the method here for the objects
        c1.print();
        c2.print();


    }
}

