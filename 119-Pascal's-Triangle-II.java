class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            list.add((int) ncr(rowIndex, i));
        }
        return list;
    }

    public long ncr(int n, int r) {
        long result = 1;
        for (int i = 0; i < r; i++) {
            result = (result * (n - i)) / (i + 1);
        }
        return result;
    }
}