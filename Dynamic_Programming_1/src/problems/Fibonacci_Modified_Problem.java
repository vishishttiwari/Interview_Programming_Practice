package problems;

public class Fibonacci_Modified_Problem {
	    
	

    static long fibonacciModifiedRecursion(long t1, long t2, int n) {
        if (n == 3) return t2;
        if (n == 2) return t2;
        if (n <= 1) return t1;
        
        long term = fibonacciModifiedRecursion(t1, t2, n-1)*fibonacciModifiedRecursion(t1, t2, n-1) + fibonacciModifiedRecursion(t1, t2, n-2);
        
        return term;
    }
    
    // top-down
    static long[] memo;
    static long fibonacciModifiedMemoization(long t1, long t2, int n) {
        if (memo[n-1] != 0) return memo[n-1];
        
        long term = fibonacciModifiedMemoization(t1, t2, n-1)*fibonacciModifiedMemoization(t1, t2, n-1) + fibonacciModifiedMemoization(t1, t2, n-2);
        
        memo[n-1] = term;
        return memo[n-1];
    }
    
    // bottom-up
    static long fibonacciModifiedDP(long t1, long t2, int n) {
        if (n == 3) return t2;
        if (n == 2) return t2;
        if (n <= 1) return t1;
        
        long[] memoDP = new long[n];
        memoDP[0] = t1;
        memoDP[1] = t2;
        memoDP[2] = t2;
        
        for (int i = 3; i < n; i++) {
            memoDP[i] = memoDP[i-1]*memoDP[i-1] + memoDP[i-2];
        }
        
        return memoDP[n-1];
    }
}
