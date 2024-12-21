class Solution {
    public void reverseString(char[] s) {
        int start=0,last=s.length-1;
        for(int i=0;i<s.length/2;i++){
            char str=s[start];
            s[start]=s[last];
            s[last]=str;
            start++;
            last--;
        }
    }
}