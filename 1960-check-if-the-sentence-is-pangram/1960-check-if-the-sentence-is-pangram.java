class Solution {
    public boolean checkIfPangram(String sentence) {
         if (sentence.length() < 26) {
            return false; // A pangram must have at least 26 characters
        }
        
        HashSet<Character> set = new HashSet<>();
        
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                set.add(Character.toLowerCase(c));
            }
        }
        
        return set.size() == 26;
    


    }
}