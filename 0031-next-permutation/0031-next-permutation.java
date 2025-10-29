class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;

        // 1) find 1st decreasing from end
        while(i>=0 && nums[i]>=nums[i+1]) 
            i--;
        
        // 2) next greater elem from right
        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i])
                j--;
            swap(nums, i, j);
        }
        // 3) reverse (i+1, n-1);
        reverse(nums,i+1,n-1);
    }

    public void swap(int nums[], int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public void reverse(int nums[], int i, int j){
        while(i<=j){
            swap(nums,i,j);
            i++; j--;
        }
    }
}