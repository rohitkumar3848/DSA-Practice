public class isKthBitSet {
    static boolean isKthBitSet(int n, int k) {
        // Write your code here.
        return ((n >> (k - 1)) & 1) == 1;
    }
}
