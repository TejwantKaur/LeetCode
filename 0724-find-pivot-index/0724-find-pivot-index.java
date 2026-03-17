class Solution {
    public int pivotIndex(int[] nums) {
      int n = nums.length;
      int prefix[] = new int[n]; prefix[0]=nums[0];
      int suffix[] = new int[n]; suffix[n-1]=nums[n-1];

      for(int i=1; i<n; i++){
        prefix[i] = nums[i] + prefix[i-1];
      }

      for(int i=n-2; i>=0; i--){
        suffix[i] = nums[i] + suffix[i+1];
      }

      int idx=-1;
      int left_sum=0;
      int rt_sum=0;

      for(int i=0; i<n; i++){
        left_sum= i==0? 0: prefix[i-1];
        rt_sum= i==n-1? 0: suffix[i+1];
        if (left_sum==rt_sum){
          return i;
        }
      }
      return idx;
    }
}