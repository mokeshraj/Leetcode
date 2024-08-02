class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        String str = s + s;
        return str.substring(1, 2 * len - 1).contains(s);
    }
}
