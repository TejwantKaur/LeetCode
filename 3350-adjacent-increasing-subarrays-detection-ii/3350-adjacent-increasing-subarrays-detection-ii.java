class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n=nums.size();

        int left[] = new int[n];
        int rt[] = new int [n];
        left[0] = 1;
        rt[n-1] = 1;

        for(int i=1; i<n; i++){
            if(nums.get(i)>nums.get(i-1))
                left[i] = left[i-1]+1;
            else
                left[i] = 1;
        }
        for(int i=n-2; i>=0; i--){
            if(nums.get(i) < nums.get(i+1))
                rt[i] = rt[i+1]+1;
            else
                rt[i]=1;
        }
        // for adjacent
        int ans=0;
        for(int i=0; i<n-1; i++){
            int k=Math.min(left[i], rt[i+1]);
            ans = Math.max(ans,k);
        }
        return ans;
        
    }
}