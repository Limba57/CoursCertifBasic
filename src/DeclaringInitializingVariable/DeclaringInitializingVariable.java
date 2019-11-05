package DeclaringInitializingVariable;

public class DeclaringInitializingVariable {

    public static void main(String[] args) {

        // declaring an initializing in two line
        int myNumber; // declaration
//        System.out.println("myNumber =" + myNumber);
        myNumber = 10; // initialization
        System.out.println("myNumber = " + myNumber);

        // in one line
        double myDouble = 7.50;
        System.out.println("myDouble = " + myDouble);

        float myFloat1, myFloat2, myfloat3; // ok mais pas tres lisible
        float myFloat4; float myFloat5 ; // idem
        float myFloat6 = 5f, myFloat7 = 10f, myFloat8 = 20.36f; // idem

//        double d2, double d3; // no compilation
//        int i3; i4 ; // no compilation

        int un;
        int _deux;
        int $trois;
//        int 4 quatre; // no compilation
//        int int = 4; // no compilation
        char Char;
        char cHar;
        float __OkButNotNice$__123;

        // illegals exemple
        // double 3point;
        // double my@Street;
        // float *$coffee;
        // int public;

    }
}
