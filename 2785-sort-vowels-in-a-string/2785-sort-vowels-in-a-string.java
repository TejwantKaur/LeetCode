class Solution {
    public String sortVowels(String s) {
        Set<Character> hs = Set.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        List<Character> vowel = new ArrayList<>();

        // collect vowels
        for (char c : s.toCharArray())
            if (hs.contains(c))
                vowel.add(c);

        Collections.sort(vowel);
        StringBuilder res = new StringBuilder();

        int i = 0;
        for (char c : s.toCharArray()){
            if (hs.contains(c))
                res.append(vowel.get(i++));
            else
                res.append(c);
        }
        return res.toString();

    }
}