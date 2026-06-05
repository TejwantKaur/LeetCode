class Solution {
    public int majorityElement(int[] nums){
      int n=nums.length;
      if(n==0 || n==1) return nums[0];

      Arrays.sort(nums);
      int freq=1;

      for(int i=1; i<n; i++){
        if(nums[i]==nums[i-1]) {
            freq++;
            if(freq>n/2) {
              return nums[i];
            };
        } else freq=1; 
      }
      return 0;
        
    }
}