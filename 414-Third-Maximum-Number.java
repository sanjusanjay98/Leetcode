class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }
        Integer[] arr = hs.toArray(new Integer[0]);
        Arrays.sort(arr, Collections.reverseOrder());
        if (arr.length < 3) {
            return arr[0];
        } else {
            return arr[2];
        }
    }
}
