class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        Integer[][] dp = new Integer[n][n];

        // for (int i = 0; i < n; i++) {
        //     Arrays.fill(dp[i], -1);
        // }

        return help(triangle,0,0,dp);
    }

    private int help(List<List<Integer>> t, int row, int col, Integer[][]path){
        if (row == t.size()-1)
            return t.get(row).get(col);

        if(path[row][col] != null)
            return path[row][col];

        int down = help(t, row+1, col, path);
        int rtdown = help(t, row+1, col+1, path);

        path[row][col] = Math.min(down, rtdown) + t.get(row).get(col);
        return path[row][col];
    }
}