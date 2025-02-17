class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        Map<Integer, PriorityQueue<Integer>> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                hm.putIfAbsent(i - j, new PriorityQueue<>());
                hm.get(i - j).add(mat[i][j]);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = hm.get(i - j).poll();
            }
        }
        return mat;
    }
}