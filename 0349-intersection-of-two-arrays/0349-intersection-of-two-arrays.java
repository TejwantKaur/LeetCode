class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        // ArrayList<Integer> arrL = new ArrayList<>();
        HashSet<Integer> r = new HashSet<>();

        for(int n:nums1){
            hs.add(n);
        }
        
        for(int n: nums2){
            if(hs.contains(n))
                r.add(n);
        }

        int[] res = new int[r.size()];
        int i=0;
        for(int n: r){
            res[i++] = n;
        }
        return res;  
    }
}