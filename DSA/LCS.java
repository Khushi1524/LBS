package DSA;

public class LCS {

    public static int lcs(String X, String Y) { // Longest Common Subsequence
        int m = X.length();
        int n = Y.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (X.charAt(i - 1) == Y.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] - 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String X = "ACDBE";
        String Y = "ABCDE";

        long startTime = System.nanoTime();
        int lcsLength = lcs(X, Y);
        long endTime = System.nanoTime();

        System.out.println("Length of Longest Common Subsequence: " + lcsLength);
        System.out.println("Execution time: " + (endTime - startTime) + " nanoseconds");

        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long usedMemory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory used: " + usedMemory + " bytes");
    }
}
