class Solution {
    public String reverseWords(String s) {
      int n=s.length();
      // s = s.strip();
      // s = s.replaceAll("\\s+", " ")

      ArrayList<String> list = new ArrayList<>();
      int l = 0;
      while(l<n){
        StringBuilder sb = new StringBuilder();
        while(l<n && s.charAt(l) == ' ') l++;
        while(l<n && s.charAt(l) != ' '){
          sb.append(s.charAt(l));
          l++;
        }
        list.add(sb.toString());
      }

      StringBuilder ans = new StringBuilder();
      for(int i=list.size()-1; i>=0; i--){
        ans.append(list.get(i));
        ans.append(" ");
      }
      
      return ans.toString().strip();
    }
}