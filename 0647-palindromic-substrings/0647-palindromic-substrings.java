class Solution {
    public boolean rec(String s, int i, int j){
      if(i>=j) return true;
      if(s.charAt(i) != s.charAt(j)) return false;

      return rec(s, ++i, --j); 
    }

    public boolean memo(String s, int i, int j, int dp[][]){
      if(i>=j) return true;
      if(dp[i][j] != 0) 
        return dp[i][j] == 1;
        // return dp[i][j] == 1? true: if -1 false;

      dp[i][j] = memo(s, ++i, --j, dp)? 1: -1;
      return dp[i][j] == 1;
    }

    public int countSubstrings(String s) {
      int n=s.length();
      int cnt=0;

      int[][]dp = new int[n+1][n+1];
      for(int i=0; i<n; i++){
        for(int j=i; j<n; j++){
          if (rec(s, i, j)) cnt++;
        }
      }
      return cnt;
    }
}