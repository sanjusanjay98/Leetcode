class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> li = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                li.add((int) ncr(i, j));
            }
            list.add(li);
        }
        return list;

    }

    public long ncr(int n, int r) {
        long result = 1;
        for (int i = 0; i < r; i++)
            result = (result * (n - i)) / (i + 1);
        return result;
    }
}