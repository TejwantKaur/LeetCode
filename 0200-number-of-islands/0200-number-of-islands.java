class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0)  
            return 0; 
        int count=0;

        for(int r=0; r<grid.length; r++){
            for(int c=0; c<grid[0].length; c++){
                if (grid[r][c] == '1'){
                    count++;
                    dfs(grid,r , c);
                }
            }
        }  
        return count;
    }
    public void dfs(char[][] grid, int r, int c){
        if (r<0||c<0|| r>=grid.length|| c>=grid[0].length)
            return;
        if (grid[r][c] != '1') 
            return;
        grid[r][c] = '0'; //visited

        // 4 directions
        int[] dr = {0,0,-1,1};
        int[] dc = {-1,1,0,0};

        for(int i=0; i<dr.length; i++){
            dfs(grid, r+dr[i], c+dc[i]);
        }
    }
}