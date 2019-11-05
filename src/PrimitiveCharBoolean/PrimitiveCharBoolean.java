package PrimitiveCharBoolean;

public class PrimitiveCharBoolean {

    public static void main(String[] args) {


        char ch = 'a';
//        char ch1 = 'ab';            // no compilation
        char ch2 = '2';               // ici c'est le caractere 2, pas un chiffre
        char unichar = '\u03A9';      // upper greek omega character
        char romanNumber = '\u216C';  // roman 50 number

        System.out.println("ch = "+ch);
        System.out.println("ch2 = "+ch2);
        System.out.println("unichar = "+unichar);
        System.out.println("romanNumber = "+romanNumber);

        boolean myBoolean = true;
        boolean myFalseBoolean = false;

        System.out.println("myBoolean = " + myBoolean);
        System.out.println("myFalseBoolean = " + myFalseBoolean);

//        boolean true = false; // no compilation
        boolean true1 = false;

    }
}
