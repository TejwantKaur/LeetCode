<h2><a href="https://leetcode.com/problems/house-robber">198. House Robber</a></h2><h3>Medium</h3><hr><p>You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and <b>it will automatically contact the police if two adjacent houses were broken into on the same night</b>.</p>

<p>Given an integer array <code>nums</code> representing the amount of money of each house, return <em>the maximum amount of money you can rob tonight <b>without alerting the police</b></em>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong> nums = [1,2,3,1]
<strong>Output:</strong> 4
<strong>Explanation:</strong> Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong> nums = [2,7,9,3,1]
<strong>Output:</strong> 12
<strong>Explanation:</strong> Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 (money = 1).
Total amount you can rob = 2 + 9 + 1 = 12.
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>1 &lt;= nums.length &lt;= 100</code></li>
	<li><code>0 &lt;= nums[i] &lt;= 400</code></li>
</ul>

<p> 
	public int rob(int[] nums) {
        int n=nums.length;

        if (n==0) return 0; // no house
        if (n==1) return nums[0]; // only 1 house

        int dp[] = new int[n];
        dp[0] = nums[0]; 
        dp[1] = Math.max(nums[0], nums[1]);

        for(int i=2; i<n; i++){
            int rob = nums[i]+dp[i-2];
            int skip = dp[i-1];

            dp[i] = Math.max(rob, skip);
        }
        return dp[n-1];
    }
    
    //  public int rob(int[] nums) {
    //     int n = nums.length;

    //     if (n==0) return 0;
    //     if (n==1) return nums[0];

    //     int prev2 = nums[0];
    //     int prev1 = Math.max(nums[0], nums[1]);

    //     for(int i=2; i<n; i++){
    //         int curr = Math.max(nums[i]+prev2, prev1);

    //         prev2 = prev1;
    //         prev1 = curr;
    //     }
    //     return prev1;
    // }

    // public int rob(int[] nums) {
    //     int n = nums.length;
    //     int dp[] = new int[n];
    //     Arrays.fill(dp,-1);
    //     int idx = 0;
    //     return helper(nums, idx, dp);
    // }

    // public int helper(int[]nums, int idx, int[]dp){
    //     if (idx>=nums.length) return 0;

    //     if (dp[idx] != -1) return dp[idx];

    //     int rob = nums[idx] + helper(nums, idx+2, dp);
    //     int skip = helper(nums, idx+1, dp);

    //     dp[idx] = Math.max(rob, skip);
    //     return dp[idx];
    // }
</p>
