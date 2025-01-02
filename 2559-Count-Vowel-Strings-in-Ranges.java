class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = queries.length;
        int[] vowel = new int[words.length];
        int[] result = new int[n];
        int count = 0;
        for(int i = 0; i < words.length; i++) {
            if(isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))){
                vowel[i] = ++count;
                continue;
            }
            vowel[i] = count;
        }
        int i = 0;
        for(int[] query : queries) {
            if(query[0] == 0)
                result[i++] = vowel[query[1]];
            else
                result[i++] = vowel[query[1]] - vowel[query[0]-1];
        }
        return result;
    }
    public static boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            return true;
        return false;
    }
}