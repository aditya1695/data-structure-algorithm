package sharma.aditya.dp;

//Longest Common Subsequence
public class LCS {
    public static void main(String[] args) {
        String str_a = "abcde";
        String str_b = "ace";
        System.out.println("Longest Common SubSequence(Recursion): " +solveUsingRecursion(str_a, str_b, 0, 0));
        System.out.println("Longest Common SubSequence(Tabulation): "+solveUsingTabulation(str_a, str_b));
    }

    private static int solveUsingTabulation(String strA, String strB) {
        int n = strA.length();
        int m = strB.length();
        int[][] dp = new int[n + 1][m + 1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(strA.charAt(i-1) == strB.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[n][m];
    }

    private static int solveUsingRecursion(String strA, String strB, int i, int j) {
        if(i > strA.length()-1 || j > strB.length()-1)
            return 0;
        if(strA.charAt(i) == strB.charAt(j))
            return 1 + solveUsingRecursion(strA, strB, i+1, j+1);
        else
            return Math.max(solveUsingRecursion(strA, strB, i+1, j), solveUsingRecursion(strA, strB, i, j+1));
    }

}
