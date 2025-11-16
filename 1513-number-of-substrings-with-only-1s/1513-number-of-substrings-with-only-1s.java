class Solution {
    public int numSub(String s) {
        long mod = 1000000000 + 7;

        long count = 0;
        long result = 0;
        for(char ch: s.toCharArray()){
            if(ch == '1'){
                count++;
            } else {
                result = (result + (count * (count + 1) / 2) % mod) % mod;
                count=0;
            }
        }
        
        // for last string as 1;
        if (count != 0){
            // result = (result + (count * (count + 1) /2) % mod);
            result = (result + (count * (count + 1) / 2) % mod) % mod;
        }

        return (int) result;
    }
}