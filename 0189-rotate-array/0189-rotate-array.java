class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n==1) return;
        
        while(k>0){
            int last=nums[n-1];
            int st=0;
            for(int i=n-1; i>0; i--){
                nums[i] = nums[i-1];
            }
            nums[0] = last;
            k--;
        }

    }
}