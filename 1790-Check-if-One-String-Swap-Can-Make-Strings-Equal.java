class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2))
            return true;
        if(s1.length() != s2.length())
            return false;
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        int diff = 0;
        for(int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i))
                diff++;
            if(diff > 2)
                return false;
            freq1[s1.charAt(i) - 'a']++;
            freq2[s2.charAt(i) - 'a']++;
        }
        return Arrays.equals(freq1,freq2);
    }
}