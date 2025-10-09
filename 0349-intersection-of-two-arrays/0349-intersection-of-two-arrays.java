class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> arrL = new ArrayList<>();

        for(int n:nums1){
            hs.add(n);
        }
        
        for(int n: nums2){
            if(hs.contains(n)){
                if(!arrL.contains(n))
                    arrL.add(n);
            }
        }
        int[] res = new int[arrL.size()];
        for(int i=0; i<arrL.size();i++){
            res[i] = arrL.get(i);
        }

        return res;  
    }
}