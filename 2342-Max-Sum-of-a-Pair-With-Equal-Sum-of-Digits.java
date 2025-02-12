class Solution {
    public int maximumSum(int[] nums) {
        int max = -1;
        Map<Integer, List<Integer>> hm = new HashMap<>();

        for (int num : nums) {
            int sum = sumOfDigits(num);
            hm.putIfAbsent(sum, new ArrayList<>());
            hm.get(sum).add(num);
        }

        for (List<Integer> li : hm.values()) {
            if (li.size() >= 2) {
                Collections.sort(li, Collections.reverseOrder());
                max = Math.max(max, li.get(0) + li.get(1));
            }
        }

        return max;
    }

    private static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}