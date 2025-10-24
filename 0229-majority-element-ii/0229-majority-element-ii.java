class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> al = new ArrayList<>();
        int n=nums.length;
        
        Arrays.sort(nums);
        int freq=1;

        for(int i=1; i<n; i++){
            if(nums[i]==nums[i-1]){
                freq++; 
            }
            else{
                if(freq>n/3 && !al.contains(nums[i-1])) 
                    al.add(nums[i-1]);
                freq=1;  
            }  
        }
        if(freq>n/3 && !al.contains(nums[n-1])) 
            al.add(nums[n-1]);
        return al;
    }
}