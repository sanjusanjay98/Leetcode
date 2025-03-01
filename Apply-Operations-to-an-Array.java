class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        int i = 0, j = 1;
        while (j < n) {
            if (nums[i] != nums[j]) {
                i++;
                j++;
            } else {
                nums[i] = nums[i] * 2;
                nums[j] = 0;
                i++;
                j++;
            }
        }
        int[] arr = new int[n];
        int k = 0;
        for (int num : nums) {
            if (num != 0) {
                arr[k++] = num;
            }
        }
        return arr;
    }
}