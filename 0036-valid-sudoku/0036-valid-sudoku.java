class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs = new HashSet<>();

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                char num = board[i][j];
                if (num!='.'){
                    if (!hs.add(num + " in row " + i) ||
                        !hs.add(num + " in col " + j) ||
                        !hs.add(num + " in box " + (i / 3) + "-" + (j / 3))) {
                        return false;
                    }
                } 
            }
        }
        return true;
    }
}