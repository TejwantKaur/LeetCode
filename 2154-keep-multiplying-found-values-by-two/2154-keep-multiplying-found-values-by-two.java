class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> hs = new HashSet<>();
        for(int n:nums)
            hs.add(n);

        while(hs.contains(original))
            original = original*2;
    
        return original;
    }
}