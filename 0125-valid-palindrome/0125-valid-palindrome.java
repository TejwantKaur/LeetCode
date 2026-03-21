class Solution {
    public boolean isPalindrome(String s) {
      int n=s.length();
      s = s.toLowerCase();
    
      int i=0, j=n-1;
      while(i<j){
        while(!Character.isLetterOrDigit(s.charAt(i)) && i<j) i++;
        while(!Character.isLetterOrDigit(s.charAt(j)) && i<j) j--;

        char ch1=s.charAt(i);
        char ch2=s.charAt(j);

        if(ch1!=ch2) return false;
        
        i++; j--;
      }
      return true;
    }
}