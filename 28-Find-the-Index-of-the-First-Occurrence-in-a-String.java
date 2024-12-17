class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()){
            return 0;
        }
        int len1 = haystack.length();
        int len2 = needle.length();
        for (int i = 0; i <= len1 - len2; i++){
            if (haystack.substring(i, i + len2).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
