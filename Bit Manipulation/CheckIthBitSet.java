class CheckIthBitSet {
    public static void main(String[] args) {
        int n = 4;
        int i = 3;
        int m = 1 << (i - 1);
        if ((m & n) != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
