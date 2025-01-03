class Solution {
    public int waysToSplitArray(int[] nums) {
        if (nums.length == 1)
            return 1;

        long[] sum = new long[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            sum[i] = sum[i - 1] + nums[i];

        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (sum[i] >= (sum[nums.length - 1] - sum[i]))
                count++;
        }
        return count;
    }
}