class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] result = new int[2];
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int[] nums : grid) {
            for (int num : nums) {
                list.add(num);
                if (!set.add(num)) {
                    result[0] = num;
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (!list.contains(i + 1)) {
                result[1] = i + 1;
                break;
            }
        }
        return result;
    }
}