class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        int idx = 0;
        return helper(nums, idx, dp);
    }

    public int helper(int[]nums, int idx, int[]dp){
        if (idx>=nums.length) return 0;

        if (dp[idx] != -1) return dp[idx];

        int rob = nums[idx] + helper(nums, idx+2, dp);
        int skip = helper(nums, idx+1, dp);

        dp[idx] = Math.max(rob, skip);
        return dp[idx];
    }
}