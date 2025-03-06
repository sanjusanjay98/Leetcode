class Solution {
    public long coloredCells(int n) {
        long total = 1, add = 4;
        if (n == 1) {
            return total;
        }

        while (--n > 0) {
            total = total + add;
            add = add + 4;
        }

        return total;
    }
}