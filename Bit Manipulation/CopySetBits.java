public class CopySetBits {

    // Copy set bits in range [l, r] from y to x.
    // Note that x is passed by reference and modified
    // by this function.
    static int copySetBits(int x, int y, int l, int r) {
        if (l < 1 || r > 32)
            return x;
        for (int i = l; i <= r; i++) {
            int mask = 1 << (i - 1);
            if ((y & mask) != 0)
                x = x | mask;
        }
        return x;
    }

    // Driver code
    public static void main(String[] args) {
        int x = 10, y = 13, l = 1, r = 32;
        x = copySetBits(x, y, l, r);
        System.out.println("Modified x is " + x);
    }
}
