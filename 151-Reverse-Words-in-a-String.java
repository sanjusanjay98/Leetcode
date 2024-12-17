class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s).reverse();
        String str = sb.toString();

        String[] words = str.split("\\s+");
        StringBuilder string = new StringBuilder();
        
        for(String word : words){
            String sbr = new StringBuilder(word).reverse().toString();
            string.append(sbr).append(" ");
        }
        return string.toString().trim();
    }
}