class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r * c != mat.length * mat[0].length){
            return mat;
        }
        int ans[][] = new int[r][c];
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++){
                arr.add(mat[i][j]);
            }
        }
        int a = 0;
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                ans[i][j] = arr.get(a);
                a++;
            }
        }
        return ans;
    }
}