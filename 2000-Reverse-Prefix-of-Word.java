class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if (index == -1) {
            return word;
        }
        int i = 0, j = index;
        char[] wordChar = word.toCharArray();
        while (i < j) {
            char temp = wordChar[i];
            wordChar[i] = wordChar[j];
            wordChar[j] = temp;
            i++;
            j--;
        }
        return new String(wordChar);
    }
}