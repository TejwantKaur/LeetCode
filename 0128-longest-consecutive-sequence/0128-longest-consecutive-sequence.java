class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        if(n==0 || n==1) 
            return n;
        Arrays.sort(nums);

        int ans=0; int count=1;
        for(int i=1; i<n; i++){
            
            if(nums[i] == nums[i-1])
                continue;
            if(nums[i]-nums[i-1]==1){
                count++;
            } else {
                ans=Math.max(ans,count);
                count=1;
            }
        }
        return Math.max(ans,count);
    }
}