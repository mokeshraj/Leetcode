import java.util.*;

class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> keyToAnagrams = new HashMap<>();

    for (final String str : strs) {
      char[] chars = str.toCharArray();
      Arrays.sort(chars);
      String key = String.valueOf(chars);
      
     
      if (!keyToAnagrams.containsKey(key)) {
        keyToAnagrams.put(key, new ArrayList<>());
      }
      keyToAnagrams.get(key).add(str);
    }

    return new ArrayList<>(keyToAnagrams.values());
  }
}
