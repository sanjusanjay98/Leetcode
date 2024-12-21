class Solution {
    public int missingNumber(int[] nums) {
        int totalsum=nums.length*(nums.length+1)/2;
        int actualsum=0;
        for(int num:nums)   actualsum+=num;
        return totalsum-actualsum;
    }
}