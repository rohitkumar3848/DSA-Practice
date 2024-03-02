class SetIthBit {
    public static void main(String[] args) {
        int n = 4;
        int i = 4;
        int m = 1 << (i - 1);
        n=n|m;
        System.out.println(n);
    }
}

