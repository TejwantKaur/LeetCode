class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n=nums.size();
        if(n<2*k) return false;
       
        int streak[] = new int[n]; //length; of inc subsequence eding at i
        streak[0] = 1;

        // calculate streaks
        for(int i=1; i<n; i++){
            if(nums.get(i) > nums.get(i-1))
                streak[i] = streak[i-1]+1;
            else
                streak[i] = 1;
        }

        // chk for 2 adjacent
        for(int i=k-1; i<n-k; i++){ //i= 3-1=2, 2+3<n
            if(streak[i]>=k && streak[i+k]>=k)
                return true;
        }
        return false;
    }
}