class Solution {
    public boolean rec(String s, int i, int j){
      if(i>=j) return true;
      if(s.charAt(i) != s.charAt(j)) return false;

      return rec(s, i+1, j-1); 
    }

    public boolean memo(String s, int i, int j, int dp[][]){
      if(i>=j) return true;
      if(s.charAt(i) != s.charAt(j)) return false;
      
      if(dp[i][j] != 0) 
        return dp[i][j] == 1;
        // return dp[i][j] == 1? true: if -1 false;

      // 0 prefilled, 1 yes palin, -1 no palin
      dp[i][j] = memo(s, i+1, j-1, dp)? 1: -1;
      return dp[i][j] == 1;
    }

    public int countSubstrings(String s) {
      int n=s.length();
      int cnt=0;

      int[][]dp = new int[n][n];
      for(int i=0; i<n; i++){
        for(int j=i; j<n; j++){
          if (memo(s, i, j, dp)) cnt++;
        }
      }
      return cnt;
    }
}