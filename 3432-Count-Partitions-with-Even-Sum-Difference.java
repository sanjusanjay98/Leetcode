class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        arr[0] = nums[0];
        for (int i = 1; i < n; i++)
            arr[i] = nums[i] + arr[i - 1];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (i != n - 1) {
                if ((arr[i] - (arr[n - 1] - arr[i])) % 2 == 0)
                    count++;
            }
        }
        return count;
    }
}