class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        ArrayList<int[]> al = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            int st = nums[i]-k;
            int end = nums[i]+k;

            al.add(new int[]{st,end});
        }
        
        Collections.sort(al, (a,b) -> a[1]-b[1]); // ascending 
        int count = 0;
        int curr = Integer.MIN_VALUE;

        for(int range[]:al){
            int start = range[0];
            int end = range[1];

            if(curr<start){
                curr=start;
                count++;
            }
            else if(curr+1 <= end){
                curr = curr+1;
                count++;
            }
        }
        return count;
    }
}