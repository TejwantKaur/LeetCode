class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for (int k = 1; k <= 60; k++) {
            long S = (long) num1 - (long) k * num2;  // remaining after k steps
            if (S < 0) continue;
            int ones = Long.bitCount(S);  // popcount(S)
            if (ones <= k && k <= S) return k;  // valid
        }
        return -1;
    }
}
