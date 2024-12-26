class Solution {
    public boolean isValidSudoku(char[][] board) {
        //To check the rows and columns if it contains duplicate
        Set<Character> hs = new HashSet<>();
        for(int i = 0; i < 9; i++) {
            hs = new HashSet<>();
            for(int j = 0; j < 9; j++) {
                if(board[i][j] >= '1' && board[i][j] <= '9') {
                    if(!(hs.add(board[i][j])))
                        return false;
                }
            }

            hs = new HashSet<>();
            for(int j = 0; j < 9; j++) {
                if(board[j][i] >= '1' && board[j][i] <= '9'){
                    if(!(hs.add(board[j][i])))
                        return false;
                }
            }
        }

        //To chech the internal 3 X 3 boxes if it also contains duplicate
        for(int i = 0; i < 9; i += 3) {
            for(int j = 0; j < 9; j += 3) {
                hs = new HashSet<>();
                for(int a = i; a < i + 3; a++) {
                    for(int b = j; b < j + 3; b++) {
                        if(board[a][b] != '.') {
                            if(!(hs.add(board[a][b])))
                                return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}