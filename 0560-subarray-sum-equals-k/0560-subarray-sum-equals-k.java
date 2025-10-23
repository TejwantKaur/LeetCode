class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int n=nums.length;
        hm.put(0,1);
        int sum=0; int ans=0;
        for(int j=0; j<n; j++){
            sum+=nums[j];
            if(hm.containsKey(sum-k)){
                ans+=hm.get(sum-k); //+count of found key
            }
            hm.put(sum, hm.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}