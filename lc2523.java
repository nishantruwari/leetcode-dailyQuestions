import java.util.*;

class Solution {

    // Sieve of Eratosthenes to precompute primes
    private boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        return isPrime;
    }

    public int[] closestPrimes(int left, int right) {
        boolean[] isPrime = sieve(right);
        int first = -1, mindiff=Integer.MAX_VALUE;
        int[] ans=new int[2];

        for (int i = left; i <= right; i++) {
            if (isPrime[i]) {
                if (first == -1) {
                    first = i;  // First prime found
                } else {
                    if(i-first<mindiff){
                        mindiff=i-first;
                        ans[0]=first;
                        ans[1]=i;
                    }

                    first=i;
                }
            }
        }
        if(ans[1]==0)
        return new int[]{-1, -1}; // If fewer than 2 primes exist

        return ans;
    }
}
