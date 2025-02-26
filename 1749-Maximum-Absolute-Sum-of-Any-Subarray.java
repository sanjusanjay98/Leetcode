class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = 0, min = 0, prefix = 0;
        for (int num : nums) {
            prefix += num;
            max = Math.max(max, prefix);
            min = Math.min(min, prefix);
        }
        return max - min;
    }
}