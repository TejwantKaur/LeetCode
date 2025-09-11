class Solution {
    public String sortVowels(String s) {
        boolean[] dp = new boolean[s.length()];
        HashSet hs = new HashSet<>();
        hs.add('a'); hs.add('e'); hs.add('i');hs.add('o');hs.add('u');
        hs.add('A'); hs.add('E'); hs.add('I');hs.add('O');hs.add('U');

        String newstr = "";
        for (int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(hs.contains(ch)){
                dp[i] = true;
                newstr+=ch;
            }
            
        } 

        // arrange new str
        char[] charArray = newstr.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);

        String fstr= "";
        int j=0;
        for(int i=0; i<s.length(); i++){
            if (dp[i]==true) {
                char ch = sortedString.charAt(j);
                fstr+=ch;
                j++;
            } else{
                char ch = s.charAt(i);
                fstr+=ch;
            }
        }
        return fstr;
    }
}