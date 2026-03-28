class Solution {
  public boolean wordPattern(String pattern, String s) {
    String[] s2=s.split(" ");

    if(pattern.length() != s2.length) return false;
    
    HashMap<Character, String> hm = new HashMap<>();
    HashMap<String,Character> rhm = new HashMap<>();

    for(int i=0; i<s2.length; i++){
      char p = pattern.charAt(i);

      // forward
      if(hm.containsKey(p)){
        if(!hm.get(p).equals(s2[i]) ) return false;
      }
      else hm.put(p,s2[i]);

      // rev
      if(rhm.containsKey(s2[i])){
        if(!rhm.get(s2[i]).equals(p) ) return false;
      }
      else rhm.put(s2[i],p);
    }
    return true;
  }
  
}