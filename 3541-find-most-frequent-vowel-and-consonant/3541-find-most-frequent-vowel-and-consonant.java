class Solution {
    private boolean isVowel(char c){
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c,0)+1);
        }

        int maxv = 0, maxc=0;
        for(char c: hm.keySet()){
            int freq = hm.get(c);
            if(isVowel(c)) 
                maxv = Math.max(freq, maxv);
            else
                maxc = Math.max(freq,maxc);   
        }
        return maxc+maxv;
    }
}