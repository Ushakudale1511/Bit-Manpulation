public class bit2 {
    public static void main(String[] args) {
        int n = 1;
        int pos = 1;
        int bitMask = 1 << pos;

        // Example using logical OR in a different context
        if ((bitMask == 0) || (n == 0)) {
            System.out.println("Either the bitMask is zero or n is zero");
        } else {
            System.out.println("Both bitMask and n are non-zero");
        }

        // Original bit checking logic
        if ((bitMask & n) == 0) {
            System.out.println("Bit is zero");
        } else {
            System.out.println("Bit is one");
        }
    }
}
