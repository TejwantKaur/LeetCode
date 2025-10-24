class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];

        int freq=0; int ans=0;
        for(int i=0; i<n; i++){
            if(freq==0)
                ans=nums[i];
            if (nums[i]==ans) freq++;
            else freq--;
        }
        return ans;
        // Arrays.sort(nums);
        // int freq=1; 
        // int ans=nums[0];
        // for(int i=1; i<n; i++){
        //     if(nums[i]==nums[i-1])
        //         freq++;
        //     else{
        //         freq=1; 
        //         ans=nums[i];
        //     }
        //     if (freq>n/2) 
        //         return ans;
        // }
        // return -1;
    }
}