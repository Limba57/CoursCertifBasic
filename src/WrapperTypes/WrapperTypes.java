package WrapperTypes;

public class WrapperTypes {

    public static void main(String[] args) {

        int myInt = 1;
        Integer myInteger = 10;
        Integer myInteger2 = 20;
        Integer myInteger3 = Integer.valueOf(30);
        Integer myInteger4 = Integer.parseInt("40");
        Integer myInteger5 = null;
//        int MyInt2 = null; // no compilation --> int n'est pas un objet et demande un int en valeur

        System.out.println("myInt      = " + myInt);
        System.out.println("myInteger  = " + myInteger);
        System.out.println("myInteger2 = " + myInteger2);
        System.out.println("myInteger3 = " + myInteger3);
        System.out.println("myInteger4 = " + myInteger4);
        System.out.println("myInteger5 = " + myInteger5);

        // convert wrapper to primitiv is call unboxing
        int myInt3 = myInteger3; // unboxing
//        int myInt4 = myInteger5; // throws null pointer execption

        // boxing is converting primitive to wrapper
        Integer myInteger6 = new Integer(60);
        Integer myInteger7 = myInt;

        printSum(1, 5); // autoboxing
        printSum(myInteger2,myInteger3);



    }

    private static void printSum(Integer first, Integer second) {
        Integer sum = first + second;
        System.out.println("sum = " + sum);
    }
}
