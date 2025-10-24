class Solution {
    private void swap(int a,int b, int[]nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void sortColors(int[] nums) {
        int low=0; int mid=0; int high=nums.length-1;

        while(mid<=high){
            // mid==0
            if(nums[mid]==0){
                swap(low,mid,nums);
                low++; mid++;
            }
            // mid==1
            else if(nums[mid]==1)
                mid++;
            else { // mid==2
                swap(high,mid,nums);
                high--;
            }
        }
    }
}