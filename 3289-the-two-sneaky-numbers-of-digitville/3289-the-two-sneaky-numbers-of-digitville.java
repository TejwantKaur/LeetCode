class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        int n = nums.length;
        Arrays.sort(nums);

        int j=0;
        for(int i=1; i<n; i++){
            if(nums[i]==nums[i-1])
                ans[j++]=nums[i];
        }
        return ans;
    }
}