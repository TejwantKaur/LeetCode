class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        int max=0;
        for(int n:map.keySet()){
            max = Math.max(map.get(n),max);
        }
        // 
        int count=0;
        for(int n:map.keySet()){
            if (map.get(n)==max)
            count+=max;
        }

        return count;
        
    }
}