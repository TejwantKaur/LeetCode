class Solution {
    static void swap(int[]nums, int i, int j){
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
    }

    static void perm(int[] nums){
      int n=nums.length;

      for(int i=n-1; i>0; i--){
        if(nums[i]>nums[i-1]){
          int greatest = n-1;
          while(nums[greatest] <= nums[i-1])
            greatest--;

          swap(nums, i-1, greatest);
          Arrays.sort(nums,i,n);
          return;
        }
      }
      // if descending
      // nums = [3,2,1];
      Arrays.sort(nums);
      return;
    }

    public void nextPermutation(int[] nums) {
      perm(nums);
    }
}