class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> li = new ArrayList<>();
        
        for (int num : nums) {
            String numStr = Integer.toString(num);
            for (char c : numStr.toCharArray()) {
                li.add(c - '0');
            }
        }
        
        int[] numArray = new int[li.size()];
        for (int i = 0; i < li.size(); i++) {
            numArray[i] = li.get(i);
        }
        
        return numArray;
    }
}
