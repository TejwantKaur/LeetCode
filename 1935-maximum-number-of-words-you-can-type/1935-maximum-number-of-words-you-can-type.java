class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        HashSet<Character> hs = new HashSet<>();

        String words[] = text.split("\\s+");
        for(int i=0; i<brokenLetters.length(); i++){
            char ch = brokenLetters.charAt(i);
            hs.add(ch);
        }
        int out = words.length;
        for(String word: words){
            for(int i=0; i<word.length(); i++){
                char ch = word.charAt(i);
                if (hs.contains(ch)){
                    out--;
                    break;
                }
            }
        }
        return out;
        
    }
}