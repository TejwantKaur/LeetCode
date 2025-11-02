class Solution {
     public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        for (int[] w : walls) grid[w[0]][w[1]] = 1; // wall
        for (int[] g : guards) grid[g[0]][g[1]] = 2; // guard
        
        boolean[][] guarded = new boolean[m][n];
        
        // Sweep rows: left→right, right→left
        for (int i = 0; i < m; i++) {
            boolean seen = false;
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) seen = false; // wall blocks
                else if (grid[i][j] == 2) seen = true; // guard starts vision
                else if (seen) guarded[i][j] = true;
            }
            seen = false;
            for (int j = n - 1; j >= 0; j--) {
                if (grid[i][j] == 1) seen = false;
                else if (grid[i][j] == 2) seen = true;
                else if (seen) guarded[i][j] = true;
            }
        }
        
        // Sweep columns: top→bottom, bottom→top
        for (int j = 0; j < n; j++) {
            boolean seen = false;
            for (int i = 0; i < m; i++) {
                if (grid[i][j] == 1) seen = false;
                else if (grid[i][j] == 2) seen = true;
                else if (seen) guarded[i][j] = true;
            }
            seen = false;
            for (int i = m - 1; i >= 0; i--) {
                if (grid[i][j] == 1) seen = false;
                else if (grid[i][j] == 2) seen = true;
                else if (seen) guarded[i][j] = true;
            }
        }
        
        int unguardedCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0 && !guarded[i][j]) unguardedCount++;
            }
        }
        
        return unguardedCount;
    }
}