class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> li = new ArrayList<>();
        int count = 1;
        for (int i = 0; i < target.length; i++) {
            while (count < target[i]) {
                li.add("Push");
                li.add("Pop");
                count++;
            }
            li.add("Push");
            count++;
        }
        return li;
    }
}