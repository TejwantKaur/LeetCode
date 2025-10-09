class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n==1) return;
        k=k%n; // when k is bigger than n
        
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

    }
    private void reverse(int[]nums, int st, int end){
        while(st<end){
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
            end--;
            st++;
        }
    }
}