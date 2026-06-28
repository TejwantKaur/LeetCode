class Solution {
    public int lengthOfLongestSubstring(String s) {
      if(s.length() == 1) return 1;

      HashSet<Character> set = new HashSet<>();
      int res=0;
      int idx=0;

      for(int i=0; i<s.length(); i++){
        if(set.contains(s.charAt(i))){
          res = Math.max(res, set.size());
          while(set.contains(s.charAt(i)))
            set.remove(s.charAt(idx++));
        } 
        set.add(s.charAt(i));
      }  

      return res = Math.max(res, set.size());      
    }
}