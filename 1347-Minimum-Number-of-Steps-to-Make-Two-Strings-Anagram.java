class Solution {
    public int minSteps(String s, String t) {
        int n = s.length();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for (int i = 0; i < n; i++) {
            freq1[s.charAt(i) - 'a']++;
            freq2[t.charAt(i) - 'a']++;
        }
        int frequency = 0;
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != 0 && freq2[i] != 0) {
                if (freq1[i] != freq2[i]) {
                    frequency += Math.abs(freq1[i] - freq2[i]);
                }
            } else if (freq1[i] == 0 && freq2[i] > 0) {
                frequency += freq2[i];
            } else if (freq2[i] == 0 && freq1[i] > 0) {
                frequency += freq1[i];
            }
        }
        return frequency / 2;
    }
}