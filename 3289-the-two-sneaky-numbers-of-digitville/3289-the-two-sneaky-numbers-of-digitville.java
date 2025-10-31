class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hs = new HashSet<>();
        int[] ans = new int[2];
        int j=0;
        for(int i=0; i<n; i++){
            if(hs.contains(nums[i])){
                ans[j++]=nums[i];
            } 
            else {
                hs.add(nums[i]);
            }
        }
        return ans;
        
    }
}


       
        
        // Arrays.sort(nums);

        // int j=0;
        // for(int i=1; i<n; i++){
        //     if(nums[i]==nums[i-1])
        //         ans[j++]=nums[i];
        // }
        // return ans;