class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int num : nums)
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == 1)
                list.add(entry.getKey());
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}