class Solution {
  public List<int[]> mer(int[][] arr, int n){
    Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
    List<int[]> list = new ArrayList<>();

    int[] prev = arr[0];  // [1,3],[2,6]

    for(int i=1; i<n; i++){
      int[] curr = arr[i];

      if(prev[1] >= curr[0]){
        // kida ending index vdda  [1,5], [2,4] --> 1,5
        prev[1] = Math.max(prev[1], curr[1]); 
      } else {
        // prev[1] < curr[0]   // [2,6],[8,10]
        list.add(prev);
        prev = curr;
      }
    }
    list.add(prev);
    return list;
  }
  public int[][] merge(int[][] intervals) {
    int n = intervals.length;
    List<int[]> list = mer(intervals, n);

    return list.toArray(new int[list.size()][]);


    
    // int curr=intervals[0];
    // for(int i=1; i<intervals.length; i++){
    //   while(i<intervals.length && intervals[i-1][1] >= intervals[i][0]
    //       && intervals[i-1][1] <= intervals[i][1])
    //     i++;

    //   list.add(new int[] {intervals[curr][0], intervals[i-1][1]});
    //   curr = i; 
    // }

    
  }
}