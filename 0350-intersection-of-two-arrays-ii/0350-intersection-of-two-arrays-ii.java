class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n1 = nums1.length; 
        int n2 = nums2.length;

        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();

        for(int n:nums1) 
            arr.add(n);

        for(int i=0; i<n2; i++){
            int n=nums2[i];
            if(arr.contains(n)){
                res.add(n);
                arr.remove(Integer.valueOf(n));
            }
        }
        int ans[] = new int[res.size()];
        int i=0;
        for(int n:res)
            ans[i++]=n;

        return ans;

    }
}