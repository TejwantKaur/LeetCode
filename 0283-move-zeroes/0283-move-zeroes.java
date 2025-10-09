class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        if (n==1) return;

        int ptr=0;
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                nums[ptr++] = nums[i];
            }
        }
        for(int i=ptr; i<n; i++){
            nums[i] = 0;
        }
        
    }
}