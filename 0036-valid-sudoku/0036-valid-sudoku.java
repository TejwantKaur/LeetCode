class Solution {
    public boolean isValidSudoku(char[][] board) {
        return helper(board,0,0);
    }

    public boolean helper(char[][] board, int row, int col){
        if(row==board.length){
            return true;
        }
        int nrow = 0;
        int ncol = 0; 
        if(col != board.length-1){
            nrow = row;
            ncol = col+1;
        }
        else{
            nrow = row+1;
            ncol = 0;
        }
        if(board[row][col] != '.'){
            if(helper(board,nrow,ncol)){
                return true;
            }
        }
        else{
            for(int digit = 1; digit<=9; digit++){
                if(isSafe(board,row,col,digit)){
                    board[row][col] = (char)(digit+'0');
                    if(helper(board,nrow,ncol)){
                        return true;
                    }
                    else{
                        board[row][col] = '.';
                    }
                }
            }
        }
        return false;
    }

    public boolean isSafe(char[][] board, int row, int col, int digit){

        for(int i=0; i<board.length; i++){
            if(board[i][col] == (char)(digit+'0')){
                return false;
            }
            if(board[row][i] == (char)(digit+'0')){
                return false;
            }
        }
        int sr = (row/3)*3;
        int sc = (col/3)*3;

        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(board[i][j] == (char)(digit+'0')){
                    return false;
                }
            }
        }
        return true;
    }
}
