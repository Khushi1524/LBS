package DSA;

public class ChineseTheorem {

    public static int modInverse(int a, int m) {
        int m0 = m, t, q;
        int x0 = 0, x1 = 1;

        if (m == 1) return 0;

        while (a > 1) {
            q = a / m;
            t = m;

            m = a % m;
            a = t;

            t = x0;

            x0 = x1 - q * x0;
            x1 = t;
        }

        if (x1 < 0) x1 += m0;

        return x1;
    }

    public static int findMinX(int[] num, int[] rem, int k) {
        int prod = 1;
        for (int i = 0; i < k; i++) {
            prod *= num[i];
        }

        int result = 0;

        for (int i = 0; i < k; i++) {
            int pp = prod / num[i];
            result += rem[i] * modInverse(pp, num[i]) * pp;
        }

        return result % prod;
    }

    public static void main(String[] args) {

        int k = 3;  // Number of equations
        int[] num = {3, 4, 5};  // Moduli
        int[] rem = {2, 3, 1};  // Remainders

        long startTime = System.nanoTime();
        int result = findMinX(num, rem, k);
        long endTime = System.nanoTime();

        System.out.println("The smallest x that satisfies all the congruences is: " + result);
        System.out.println("Execution time: " + (endTime - startTime) + " nanoseconds");
    }
}
