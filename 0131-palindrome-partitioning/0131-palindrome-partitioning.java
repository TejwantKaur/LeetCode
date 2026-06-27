class Solution {
  // is palindrome
    public static boolean isPal(String s, int i, int j){
      if(i>=j) return true;
      if(s.charAt(i) != s.charAt(j)) return false;
      return isPal(s, ++i, --j);
    }

    static void backtrack2(String s, int i, int j,List<String> curr, List<List<String>> result){
      if(i==s.length())
        result.add(new ArrayList<>(curr)) ;

      curr.add(s.substring(i,j));
    }

    static void backtrack(String s, List<String> curr, List<List<String>> result){
      int n=s.length();
      if(n==0) {
        result.add(new ArrayList<>(curr));
        return;
      }

      for(int i=0; i<n; i++){
        String substr = s.substring(0,i+1);
        if(isPal(substr, 0, i)){
          curr.add(substr);
          backtrack(s.substring(i+1), curr, result);
          curr.remove(curr.size()-1);
        }
      }
    }


    public List<List<String>> partition(String s) {
      List<List<String>> result = new ArrayList<>();

      backtrack(s, new ArrayList<>(), result);
      return result;
    }
}