class Solution {
    public boolean isAnagram(String s, String t) {
      int sl = s.length();
      int tl = t.length();
      if(sl != tl) return false;

      int[] arr = new int[26];
      for(int i=0; i<sl; i++){
        char ch1 = s.charAt(i);
        char ch2 = t.charAt(i);
        arr[ch1-'a']++;
        arr[ch2-'a']--;
      }

      for(int i=0; i<26; i++){
        if(arr[i]!=0) return false;
      }

      return true;
    }
}