class Solution {
  public String longestCommonPrefix(String[] strs) {
    int n = strs.length;
    Arrays.sort(strs);

    char s1[] = strs[0].toCharArray();
    char s2[] = strs[n-1].toCharArray();

    StringBuilder ans = new StringBuilder();
    for(int i=0; i<s1.length; i++){
      if(s1[i]!=s2[i]){
        break;
      } ans.append(s1[i]);
    }
    return ans.toString();
  }
}