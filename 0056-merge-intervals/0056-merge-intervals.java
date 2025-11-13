class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length; // 4
        if(n==0) return new int[0][0];

        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        List<int[]> ans = new ArrayList<>();
      
        int st = intervals[0][0];
        int end = intervals[0][1];

        for(int i=1; i<n; i++){
            int[] curr = intervals[i];

            if(curr[0] > end){
                ans.add(new int[] {st,end});
                st = curr[0];
                end = curr[1];
            }
            else {
                // st = Math.min(st,curr[0]);
                end = Math.max(end,curr[1]); 
            }         
        }
        ans.add(new int[] {st,end});
        return ans.toArray(new int[ans.size()][]);
    }
}