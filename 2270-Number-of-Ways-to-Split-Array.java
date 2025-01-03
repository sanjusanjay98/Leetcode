class Solution {
    public int waysToSplitArray(int[] nums) {
        long sum = 0;
        for (int num : nums)
            sum += num;
        int count = 0, i = 0;
        long prefixSum = 0;
        while (i < nums.length - 1) {
            prefixSum += nums[i];
            long otherSum = sum - prefixSum;
            if(prefixSum >= otherSum)
                count++;
            i++;
        }
        return count;
    }
}