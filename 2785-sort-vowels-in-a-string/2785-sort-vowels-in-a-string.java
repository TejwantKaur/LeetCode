class Solution {
    public String sortVowels(String s) {
        Set<Character> vowels = Set.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        List<Character> myvow = new ArrayList<>();

        // collect myvows
        for (char c : s.toCharArray())
            if (vowels.contains(c))
                myvow.add(c);

        Collections.sort(myvow);
        StringBuilder res = new StringBuilder();

        int i = 0;
        for (char c : s.toCharArray()) {
            if (vowels.contains(c))
                res.append(myvow.get(i++));
            else
                res.append(c);
        }
        return res.toString();

    }
}