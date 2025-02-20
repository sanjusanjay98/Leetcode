class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> hm = new HashMap<>();
        for (char ch : jewels.toCharArray()) {
            hm.put(ch, 0);
        }

        for (char ch : stones.toCharArray()) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            }
        }

        int count = 0;
        for (int value : hm.values()) {
            count += value;
        }

        return count;
    }
}