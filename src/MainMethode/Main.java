package MainMethode;

/**
 *
 */
public class Main {

    /**
     *this is the main method
     *
     * @param args comment line argument
     */
    public static void main(String[] args) {

        // printing size of argument
        System.out.println("arg-size :" + args.length);

        /*
        printing arguments
         */
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[ " + i + " ]= " + args[i]);
        }

        System.out.println(sum(3, 4));


    }

    /**
     *
     * Calculate sum of two integer
     *
     * @param a first integer
     * @param b second integer
     * @return sum of the two number
     */
    public static int sum(int a, int b) {
        return a + b;
    }
}
