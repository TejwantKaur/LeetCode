class Solution {
    public boolean hasSameDigits(String s) {
        
        while(s.length()>2){
            String newStr = "";
            for(int i=0; i<s.length()-1; i++){
                int one = s.charAt(i) - '0';
                int two = s.charAt(i+1) - '0';
                int res = (one+two)%10;
                newStr+=res;
            }
            s=newStr;
        }

        // if(s.charAt(0)==s.charAt(1))
        //     return true;
        // return false;

        return s.charAt(0)==s.charAt(1);
        
        
    }
}