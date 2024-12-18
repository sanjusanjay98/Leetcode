class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] rows = new int[m];
        int[] cols = new int[n];

        for(int i = 0 ; i < indices.length ; i++){
            rows[indices[i][0]]++;
            cols[indices[i][1]]++;
        }

        int rowsCount=0;
        for(int i = 0 ; i < m ; i++){
            if(rows[i] % 2 != 0)
                rowsCount++;
        }

        int colsCount=0;
        for(int i = 0 ; i < n ; i++){
            if(cols[i] % 2 != 0)
                colsCount++;
        }

        return rowsCount * n + colsCount * m - 2 * rowsCount * colsCount;
    }
}