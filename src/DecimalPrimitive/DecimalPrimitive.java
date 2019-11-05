package DecimalPrimitive;

public class DecimalPrimitive {

    public static void main(String[] args) {

//        float myNumber = 25.4; --> erreure de compilation,
//        le nombre est concidéré comme un double
        float myNumber = 25.4f;

//        double before = 10000_.4; // doesn't compile
//        double after = 10000._4; // doesn't compile
//        double first = _10000.4; // doesn't compile
//        double last = 10000.4_; // doesn't compile
        double ok = 10_000.4;

        double myDouble = 2.54;
        double myDouble2 = 2.54f;
        double myDouble3 = 2.54d; // --> pas necessaire mais correct

        double scientific = 5.000125e03; // --> 5000.125
        double scientific2 = 5.000125E03; // -> 5000.125
        double scientific3 = 5.000125e3; // --> 5000.125
        double myDouble4 = 5000.125;
        System.out.println("scientific  = "+scientific);
        System.out.println("scientific2 = "+scientific2);
        System.out.println("scientific3 = "+scientific3);
        System.out.println("myDouble4   = "+myDouble4);

        double hexPi = 0x1.91eb851eb851fp1; // p indicate hexadecimal floating point number
        System.out.println("hexPi = " + hexPi);

        double test = 0x10.5p1;
        System.out.println("test =" + test);
        System.out.println("hexTest =" + Double.toHexString(test));
    }
}
