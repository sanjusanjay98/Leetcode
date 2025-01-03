class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hs = new HashMap<>();
        hs.put('I', 1);
        hs.put('V', 5);
        hs.put('X', 10);
        hs.put('L', 50);
        hs.put('C', 100);
        hs.put('D', 500);
        hs.put('M', 1000);
        s = s.replaceAll("IV", "IIII");
        s = s.replaceAll("IX", "VIIII");
        s = s.replaceAll("XL", "XXXX");
        s = s.replaceAll("XC", "LXXXX");
        s = s.replaceAll("CD", "CCCC");
        s = s.replaceAll("CM", "DCCCC");
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += hs.get(s.charAt(i));
        }
        return sum;
    }
}