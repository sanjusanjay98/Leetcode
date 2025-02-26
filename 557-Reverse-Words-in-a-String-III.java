class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        String join = "";
        for (String str : arr) {
            join = join + (new StringBuilder(str).reverse()).toString() + " ";
        }
        return join.trim();
    }
}