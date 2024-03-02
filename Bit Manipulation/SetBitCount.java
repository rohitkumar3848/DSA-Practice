public class SetBitCount {
    static int setBits(int N) {
        // code here
        return Integer.bitCount(N);

    }

    public static int countSetBits(int n) {
        // Write your code here.
        int res = 0;
        while (n != 0) {
            res += n & 1;
            n >>= 1;
        }
        return res;
    }
}
