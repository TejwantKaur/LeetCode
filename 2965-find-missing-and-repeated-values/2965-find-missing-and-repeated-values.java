class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
      HashSet<Integer> hs = new HashSet<>();
      int n = grid.length;
      int n2 = n*n;
      int totalSum = n2*(n2+1)/2;

      int rep=0; int sum=0;
      for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
          if(hs.contains(grid[i][j])){
             rep = grid[i][j];
             sum -= grid[i][j];
          }
          hs.add(grid[i][j]);
          sum += grid[i][j];
        }
      }

      int miss = totalSum-sum;
      return new int[] {rep,miss};
    }
}