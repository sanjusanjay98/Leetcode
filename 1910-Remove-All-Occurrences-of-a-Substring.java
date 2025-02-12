class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder str = new StringBuilder(s);
        int m = part.length();
        while (str.indexOf(part) != -1) {
            int i = str.indexOf(part);
            str.delete(i, i + m);
        }
        return str.toString();
    }
}