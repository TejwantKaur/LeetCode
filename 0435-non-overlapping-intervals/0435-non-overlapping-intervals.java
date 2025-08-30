class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[1]));

        int n = intervals.length;
        int act = 0;
        int last_end = intervals[0][1]; //2
        act++;

        for(int i=0; i<n; i++){
            if(intervals[i][0] >= last_end){
                act++;
                last_end=intervals[i][1];
            }
        }

        return n-act;
    }
}