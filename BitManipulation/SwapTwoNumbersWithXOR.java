class SwapTwoNumbersWithXOR{
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        a = a ^ b;
        b = a ^ b; // (a ^ b)^b = a
        a = a ^ b; // a ^ b ^ a = b
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
}