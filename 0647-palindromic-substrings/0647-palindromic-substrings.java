class Solution {
    public boolean rec(String s, int i, int j){
      if(i>=j) return true;
      if(s.charAt(i) != s.charAt(j)) return false;

      return rec(s, ++i, --j); 
    }
    public int countSubstrings(String s) {
      int cnt=0;
      for(int i=0; i<s.length(); i++){
        for(int j=i; j<s.length(); j++){
          if (rec(s, i, j)) cnt++;
        }
      }
      return cnt;
    }
}