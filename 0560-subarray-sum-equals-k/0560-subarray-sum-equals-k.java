class Solution {
    public int subarraySum(int[] nums, int k) {
      HashMap<Integer,Integer> hm = new HashMap<>();
      hm.put(0,1);
      int pre=0, cnt=0;

      for(int i=0; i<nums.length; i++){
        pre+=nums[i];
        int key=pre-k;
        // key exists in map??
        if(hm.containsKey(key))
          cnt+=hm.get(key);
        hm.put(pre,hm.getOrDefault(pre,0)+1);
      } 
      return cnt;
    }
}