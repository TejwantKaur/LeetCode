class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c)+1);
            }else{
                hm.put(c,1);
            }
        }
        
        char[] vowels = {'a','e','i','o','u'}; 
        char[] cons = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};

        int maxv=0;
        for(char c:vowels){
            if (hm.containsKey(c)){
                maxv = Integer.max(hm.get(c), maxv);

            }
        }

        int maxc=0;
        for(char c:cons){
            if (hm.containsKey(c)){
                maxc = Integer.max(hm.get(c), maxc);
            }
        }
        int out = maxc+maxv;
        return out;
    }
}