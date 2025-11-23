class Solution {
    public int[] shuffle(int[] nums, int n) {
        int st = 0;
        int mid = n;
        
        int ans[] = new int[nums.length];
        int i = 0;
        while(mid<nums.length){
            ans[i++] =  nums[st++];
            ans[i++] = nums[mid++];
        }
        return ans;
    }
}