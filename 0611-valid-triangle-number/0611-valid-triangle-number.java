class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length; 
        int count = 0;

        for(int i=n-1; i>=2; i--){ // kio 2,3,4...2 nd 3 smaller than 4
            int left = 0, rt = i-1; //i-1 last index
            while(left < rt){
                if(nums[left] + nums[rt] > nums[i]){
                    count += rt-left;
                    rt--;
                } else 
                    left++;
            }
        }
        return count;  
    }
}