package VariableScope;

public class VariableScope {


    static int myNewint;

    public static void main(String[] args) {

        int myLocalInt = 10;

        {
            int blockInt = 20;
            {
                System.out.println("blockInt = " + blockInt);
//                int blockInt = 30; // ne compile pas -- deja definit dans le block au dessus
                blockInt =30;
                System.out.println("blockInt deuxieme initialisation = " + blockInt);

            }

        }


        {
            int myOtherInt = 20;
            int anOtherInt = 45;
            System.out.println("myOtherInt = " + myOtherInt);
            System.out.println("inCodeBlock myLocalint = " + myLocalInt);
        }

//        System.out.println("myOtherInt = " + myOtherInt); // cette variable n'est pas accessible

        System.out.println("myLocalInt = " + myLocalInt);
        System.out.println("myNewInt = " + myNewint);

        int myOtherInt = 30;
        int anOtherInt = 55;
        System.out.println("myOtherInt = " + myOtherInt);
        System.out.println("anotherInt = " + anOtherInt);


    }

    public static void myMethod() {

//        myLocalInt = 6; // cette variable n'est pas acccessible

    }
}
