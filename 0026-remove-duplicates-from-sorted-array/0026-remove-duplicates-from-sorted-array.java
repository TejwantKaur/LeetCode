class Solution {
    public int removeDuplicates(int[] nums) {
        int curr=nums[0];
        int count=1;
        int ptr=1;

        for(int n:nums){
            if(curr!=n){
                count++;
                curr=n;
                nums[ptr]=n;
                ptr++;
            }
        }
        return count; 
    }
}