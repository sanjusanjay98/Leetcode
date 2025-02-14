class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> li = new ArrayList<>(hm.entrySet());
        li.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : li) {
            result.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        return result.toString();
    }
}