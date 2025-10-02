class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length==0) return 0;

        int curr=nums[0];
        int count=1;
        int i=1;

        for(int n:nums){
            if(curr!=n){
                count++;
                curr=n;
                nums[i]=n;
                i++;
            }
        }
        return count; 
    }
}