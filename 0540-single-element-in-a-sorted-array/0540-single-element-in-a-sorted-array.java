class Solution {
    public int singleNonDuplicate(int[] nums) {
      int n= nums.length;
      if (nums.length==1) return nums[0];
      if (nums[0] != nums[1]) return nums[0];
      if (nums[n - 1] != nums[n - 2]) return nums[n - 1];
      
      int l=1, end = nums.length-2;
      while(l<=end){
        int mid = l+(end-l)/2;
        if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) 
          return nums[mid];

        // even both sides
        if(mid%2 == 0) {
          if(nums[mid]==nums[mid-1])
            end = mid-1;
          else 
            l = mid+1;
        }
        // odd
        else {
          if(nums[mid]==nums[mid-1]){
            l = mid+1;
          }
          else 
            end = mid-1;
        }
        
      }
      return -1;
    }
}