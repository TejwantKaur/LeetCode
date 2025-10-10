class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for(int n: nums){
            if(!hs.contains(n))
                hs.add(n);
            else
                hs.remove(n);
        }
        for(int n:hs){
            return n;
        } 
        return -1;
    }
}