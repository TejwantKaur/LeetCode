class Solution {
    public int[] searchRange(int[] nums, int target) {
      int n = nums.length;
      int st = 0, end = n-1;

      int first = -1;
      int last = -1;

      while(st<=end){
        int mid = st + (end-st)/2;
        if(nums[mid] == target){
          first = mid;
          last=mid;
          if(mid > 0 && nums[mid-1] == target){
            while(first > 0 && nums[first-1] == target)
              first--;
          }

          if(mid < n-1 && nums[mid+1] == target){
            while(last < n-1 && nums[last+1] == target)
              last++;
          }

          return new int[] {first, last};
        } 
        else if(nums[mid]>target)
          end = mid-1;
        else
          st = mid+1;
      }
      return new int[]{-1,-1}; 
    }
}