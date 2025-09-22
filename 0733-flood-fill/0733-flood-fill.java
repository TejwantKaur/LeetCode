class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][] vis = new boolean[image.length][image[0].length];
        helper(image,sr,sc,color,vis,image[sr][sc]);
        return image;
    }
    public void helper(int[][] image, int sr, int sc, int color, boolean[][]vis, int stClr){ // starting color to be modified
        if(sr<0||sc<0 || sr>=image.length||sc>=image[0].length || vis[sr][sc] || image[sr][sc]!=stClr)
            return;

        vis[sr][sc] = true;
        image[sr][sc] = color;

        // left
        helper(image, sr, sc-1, color, vis, stClr);

    // right
        helper(image, sr, sc+1, color, vis, stClr);

    // up
        helper(image, sr-1, sc, color, vis, stClr);

    // down
        helper(image, sr+1, sc, color, vis, stClr);
    }
}