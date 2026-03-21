class Solution {
    public void reverseString(char[] s) {
      int n=s.length;

      int i=0, j=n-1;
      while(i<j){
        char ch1=s[i];
        char ch2=s[j];

        s[i]=ch2; i++;
        s[j]=ch1; j--;
      }
        
    }
}