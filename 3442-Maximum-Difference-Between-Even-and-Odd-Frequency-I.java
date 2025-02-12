class Solution {
    public int maxDifference(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for (char ch : s.toCharArray())
            freq[ch - 'a']++;
        int oddFreq = Integer.MIN_VALUE, evenFreq = Integer.MAX_VALUE;
        for (int count : freq) {
            if (count > 0) {
                if (count % 2 == 0) {
                    if (count < evenFreq)
                        evenFreq = count;
                } else {
                    if (count > oddFreq)
                        oddFreq = count;
                }
            }
        }
        if (oddFreq == Integer.MIN_VALUE || evenFreq == Integer.MAX_VALUE)
            return 0;
        return oddFreq - evenFreq;
    }
}