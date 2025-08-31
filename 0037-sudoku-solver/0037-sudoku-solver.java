class Solution {
    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    public boolean solve(char[][] board, int row, int col){
        // Base case
        if (row==9) return true;

        // recursion
        int nextRow=row, nextCol=col+1;
        if (nextCol==9){
            nextRow = row+1;
            nextCol = 0;
        }

        if (board[row][col] != '.'){
            return solve(board, nextRow, nextCol);
        }

        // for "." Place Digit
        for(int dig=1; dig<=9; dig++){
            char ch = (char) (dig +'0');
            if (isSafe (board, row, col, ch)){
                board[row][col] = ch;
                if(solve(board, nextRow, nextCol)){
                    return true;
                }
                board[row][col] = '.';
            }
        } 
        return false;
    }

    public boolean isSafe(char[][] board, int row, int col, char dig){
        
        // colm
        for (int i=0; i<9; i++){
            if (board[i][col] == dig){
                return false;
            }
        }
        // row
        for (int j=0; j<9; j++){
            if (board[row][j] == dig){
                return false;
            }
        }
        // grid
        int sr = (row/3)*3; //starting row
        int sc = (col/3)*3;

        for(int i=sr; i<sr+3; i++){
            for (int j=sc; j<sc+3; j++){
                if (board[i][j] == dig){
                    return false;
                }
            }
        }
        return true;
    }

}