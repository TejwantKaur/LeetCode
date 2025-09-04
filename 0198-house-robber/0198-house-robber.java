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

















    // public int rob(int[] nums) {
    //     int n=nums.length;

    //     if (n==0) return 0; // no house
    //     if (n==1) return nums[0]; // only 1 house

    //     int dp[] = new int[n];
    //     dp[0] = nums[0]; 
    //     dp[1] = Math.max(nums[0], nums[1]);

    //     for(int i=2; i<n; i++){
    //         int rob = nums[i]+dp[i-2];
    //         int skip = dp[i-1];

    //         dp[i] = Math.max(rob, skip);
    //     }
    //     return dp[n-1];
    // }
}