class Solution {
    public int maximumCount(int[] nums) {
        int neg = 0, pos = 0;
        for (int num : nums) {
            if (num == 0) {
                continue;
            } else if (num > 0) {
                pos++;
            } else {
                neg++;
            }
        }
        return Math.max(pos, neg);
    }
}