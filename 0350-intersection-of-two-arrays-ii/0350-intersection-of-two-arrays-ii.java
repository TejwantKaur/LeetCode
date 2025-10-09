class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> l = new ArrayList<>();

        for(int n:nums1){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        for(int n:nums2){
            if(hm.containsKey(n) && hm.get(n)>0){
                hm.put(n,hm.get(n)-1);
                l.add(n);
            }
        }

        int ans[] = new int[l.size()];
        int i=0;
        for(int n:l)
            ans[i++]=n;

        return ans;
    }
}