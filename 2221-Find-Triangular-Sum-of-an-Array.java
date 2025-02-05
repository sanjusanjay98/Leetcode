class Solution {
    public int triangularSum(int[] nums) {
        return sum(nums, nums.length);
    }
    public int sum(int[] nums, int n) {
        if(n == 1)
            return nums[0];
        for(int i = 0; i < n - 1; i++) 
            nums[i] = (nums[i] + nums[i + 1]) % 10;
        return sum(nums, n - 1);
    }
}