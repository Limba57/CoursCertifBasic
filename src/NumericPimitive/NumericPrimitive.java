package NumericPimitive;

public class NumericPrimitive {

    public static void main(String[] args) {

        long max = 1_234_567_890_123L; // la tettre L (ou l) represente le long en lui meme, sans lui pas de compilation

        // octal (0-7) --> le nombre doit commencer par 0 zero
        // int oct = 08; --> impossible
        int firstOct = 010; // 8 de decimal
        int secondOct = 022; // 18 decimal

        int sumOct = firstOct + secondOct; // 26 decimal 32 en octal

        System.out.println("first=" + firstOct + " second=" + secondOct);
        System.out.println("decimal sum=" + sumOct);
        System.out.println("octal sum=" + Integer.toOctalString(sumOct));

        // hexadecimal (0-9 and A-F) --> le nombre doit commzencer par 0x
        int firstHex = 0xF; // 15 decimal
        int secondHex = 0x1E; // 30 decimal
        int sumHex = firstHex + secondHex; // 45 decimal, 2D en hexa
        System.out.println("first=" + firstHex + " second=" + secondHex);
        System.out.println("decimal sum=" + sumHex);
        System.out.println("hexadecimal sum=" + Integer.toHexString(sumHex));

        // Binary (0-1) --> 0b
        // int bina= 0b2; --> impossible
        int firstBin = 0b1001; // 9 decimal
        int secondBin = 0b0111; // 7 decimal
        int sumBin = firstBin + secondBin; // 16 decimal, 10000 en binnaire
        System.out.println("first=" + firstBin + " second=" + secondBin);
        System.out.println("decimal sum=" + sumBin);
        System.out.println("binary sum=" + Integer.toBinaryString(sumBin));

    }
}
