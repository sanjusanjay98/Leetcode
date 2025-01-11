class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = 0;
        int i = 0, j = 0;

        while (j < t.length()) {
            if (i < s.length() && s.charAt(i) == t.charAt(j)) {
                count++;
                i++;
            }
            j++;
        }

        return count == s.length();
    }
}
