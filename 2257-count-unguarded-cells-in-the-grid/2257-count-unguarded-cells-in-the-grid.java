class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];

        for(int[] g: guards) 
            grid[g[0]][g[1]] = 1; //guard
        for(int[] w: walls) 
            grid[w[0]][w[1]] = 2; //wall

        for(int[] g:guards){
            int row = g[0];
            int col = g[1];
            
            // up
            for(int i=row-1; i>=0; i--){
                if(grid[i][col]==1 || grid[i][col]==2)
                    break;
                if(grid[i][col]==0) 
                    grid[i][col]=3; // guarded;
            }

            // down
            for(int i=row+1; i<m; i++){
                if(grid[i][col]==1 || grid[i][col]==2)
                    break;
                if(grid[i][col]==0) 
                    grid[i][col]=3; // guarded;
            }

            // left
            for(int j=col-1; j>=0; j--){
                if(grid[row][j]==1 || grid[row][j]==2)
                    break;
                if(grid[row][j]==0) 
                    grid[row][j]=3; // guarded;
            }

            // right
            for(int j=col+1; j<n; j++){
                if(grid[row][j]==1 || grid[row][j]==2)
                    break;
                if(grid[row][j]==0) 
                    grid[row][j]=3; // guarded;
            }
        }

        // count unguarded cells
        int count=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==0)
                    count++;
            }
        }
        return count;
    }
}