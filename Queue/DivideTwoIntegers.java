public class DivideTwoIntegers {
    public static void main(String[] args) {
        int[][] testCases = {
            {-2147483648, -1},      // Overflow case → expect 2147483647
            {-2147483648, 2147483647}, // Expect 0
            {-2147483648, -2147483648}, // Expect 1
            {0, 5},                // Expect 0
            {2147483646, 2147483647}, // Expect 0
            {2147483647, -1},      // Expect -2147483647
            {-101, 1000},          // Expect 0
            {15, -4}               // Expect -3
        };

        for (int[] test : testCases) {
            int dividend = test[0];
            int divisor = test[1];
            int result = divide(dividend, divisor);
            System.out.println("Input: dividend = " + dividend + ", divisor = " + divisor);
            System.out.println("Output: " + result);
            System.out.println("----------------------");
        }
    }

    public static int divide(int dividend, int divisor) {
        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        // Convert both numbers to negatives to avoid overflow
        boolean negative = (dividend < 0) ^ (divisor < 0);
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        long result = 0;

        while (a >= b) {
            long temp = b, multiple = 1;
            while (a >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            a -= temp;
            result += multiple;
        }

        result = negative ? -result : result;
        return (int) result;
    }
}
