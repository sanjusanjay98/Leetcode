class Solution {
    public int minNumberOperations(int[] target) {
        int n = target.length;
        int ans = target[0];
        for(int i = 1; i < n; i++) { 
            if (target[i] > target[i - 1]) {
                ans += target[i] - target[i-1];
            }
        }
        return ans;
    }
}