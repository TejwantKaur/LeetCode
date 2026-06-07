class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);

    List<List<Integer>> list = new ArrayList<>();
    for(int i=0; i<nums.length-2; i++){
      if(i>0 && nums[i]==nums[i-1]) continue;

      int fix = nums[i];
      int l=i+1, r=nums.length-1;
      while(l<r){
        if(nums[l] + nums[r] == -fix){
          list.add(List.of(fix,nums[l],nums[r]));
          while(l<r && nums[l]==nums[l+1]) l++;
          while(r>l && nums[r]==nums[r-1]) r--;

          l++; r--;
        }
        else if(nums[l] + nums[r] > -fix) r--;
        else l++;
      }
    }  
    return list;
  }
}