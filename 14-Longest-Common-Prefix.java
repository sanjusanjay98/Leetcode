class Solution {
    public String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        String st=str[0];
        String end=str[str.length-1];
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<Math.min(st.length(),end.length()); i++){
            if(st.charAt(i) == end.charAt(i)) sb.append(st.charAt(i));
            else    break;
        }
        return sb.toString();
    }
}