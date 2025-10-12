import java.util.*;

class Solution {
    static final int MOD = 1_000_000_007;
    
    public int magicalSum(int m, int k, int[] nums) {
        int n = nums.length;
        long[][][][] dp = new long[n + 1][m + 2][m + 1][k + 2];
        dp[0][0][0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int carry = 0; carry <= m; carry++) {
                for (int used = 0; used <= m; used++) {
                    for (int ones = 0; ones <= k; ones++) {
                        long cur = dp[i][carry][used][ones];
                        if (cur == 0) continue;

                        for (int x = 0; x + used <= m; x++) {
                            int newCarry = (carry + x) >> 1;
                            int bit = (carry + x) & 1;
                            int newOnes = ones + bit;
                            int newUsed = used + x;
                            if (newOnes > k) continue;

                            long ways = nCr(m - used, x);
                            long prod = pow(nums[i], x, MOD);
                            dp[i + 1][newCarry][newUsed][newOnes] =
                                (dp[i + 1][newCarry][newUsed][newOnes]
                                 + cur * ways % MOD * prod % MOD) % MOD;
                        }
                    }
                }
            }
        }

        long ans = 0;
        for (int carry = 0; carry <= m; carry++) {
            for (int ones = 0; ones <= k; ones++) {
                int finalOnes = ones + Integer.bitCount(carry);
                if (finalOnes == k) {
                    ans = (ans + dp[n][carry][m][ones]) % MOD;
                }
            }
        }
        return (int) ans;
    }

    // modular power
    private long pow(long a, int b, int mod) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res = res * a % mod;
            a = a * a % mod;
            b >>= 1;
        }
        return res;
    }

    // nCr using multiplicative formula (no mod factorials needed since small m ≤ 30)
    private long nCr(int n, int r) {
        if (r < 0 || r > n) return 0;
        long res = 1;
        for (int i = 1; i <= r; i++) {
            res = res * (n - i + 1) / i;
        }
        return res;
    }
}
