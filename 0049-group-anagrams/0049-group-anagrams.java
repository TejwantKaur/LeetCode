class Solution {
  public static String string_compression(String s){
    // HashMap<Character,Integer> hm = new HashMap<>();
    // for(char c: s.toCharArray()){
    //   hm.put(c,hm.getOrDefault(c,0)+1);
    // }
    int freq[] = new int[26];
    for(char c: s.toCharArray()){
      freq[c-'a']++;
    }
    StringBuilder sb = new StringBuilder();
    char c='a';
    for(int i:freq){
      sb.append(c);
      sb.append(i);
    }
    return sb.toString();
    // String ret = Arrays.toString(fre);
    // return ret;
  }

  public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> map = new HashMap<>();
    for (String str:strs){
      String strComp = string_compression(str);
      // compressed string, original
      // if(map.containsKey(strComp)) {
      //   map.get(strComp).add(str);
      // }
      // else {
      //   List<String> list = new ArrayList<>();
      //   list.add(str);
      //   map.put(strComp,list);
      // }
      map.computeIfAbsent(strComp, k -> new ArrayList<>()).add(str);
    }
    return new ArrayList<>(map.values());      
  }
}