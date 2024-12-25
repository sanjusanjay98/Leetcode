class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums) {
            hs.add(num);
            int rem, rev = 0, temp = num;
            while (temp > 0) {
                rem = temp % 10;
                rev = rev * 10 + rem;
                temp /= 10;
            }
            hs.add(rev);
        }
        return hs.size();
    }
}