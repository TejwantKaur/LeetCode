class Solution {
    public int longestConsecutive(int[] nums) {
      int n=nums.length;
      if(n==0 || n==1) return n;

      int len=1; int ans=0;
      Arrays.sort(nums);
      for(int i=1; i<nums.length; i++){
        int num=nums[i];

        if(num==nums[i-1]) continue;
        else if(num-nums[i-1]==1) len++;
        else{
          ans=Math.max(ans,len);
          len=1;
        }
      }
      return Math.max(ans,len);
    }
}