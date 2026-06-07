class Solution {
    public void swap(int[]arr, int i, int j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    public void sortColors(int[] nums) {
      int l = 0; 
      int mid = 0;
      int r = nums.length-1;
      while(mid <= r){
        while(mid<=r && nums[mid] == 0){
          swap(nums, l,mid);
          l++; 
          mid++;
        } 

        while(mid<=r && nums[mid] == 1) 
          mid++;

        while(mid<=r && nums[mid] == 2) {
          swap(nums, mid, r);
          r--; 
        }
      }
    }
}