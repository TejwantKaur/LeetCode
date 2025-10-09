class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        if (n==1 && nums[0] == target) return 0;
        
        int st=0; int end=n-1;
        while(st<=end){
            int mid = st+(end-st)/2;

            if(nums[mid]==target)
                return mid;
            if(nums[mid]<target)
                st = mid+1;
            else
                end = mid-1;
        }
        return -1;
        
    }
}