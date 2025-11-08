class Solution {
    private boolean alphaNum(char ch){
        ch = Character.toLowerCase(ch);
        if((ch >= '0' && ch <= '9') ||
        (ch >= 'a' && ch <= 'z')){
            return true;
        }
        return false;
    }
    public boolean isPalindrome(String s) {
        int st = 0, end = s.length()-1;

        while(st < end) {
            if(!alphaNum(s.charAt(st))){
                st++; continue;
            }
            if(!alphaNum(s.charAt(end))){
                end--; continue;
            }
            
            char ch1 = Character.toLowerCase(s.charAt(st));
            char ch2 = Character.toLowerCase(s.charAt(end));

            if(ch1 != ch2)
                return false;

            st++; end--;
        }
        return true;
    }
}