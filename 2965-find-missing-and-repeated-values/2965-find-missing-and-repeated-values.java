class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int ans[] = new int[2];

        int rep = -1; int miss = -1; 
        TreeSet<Integer> hs = new TreeSet<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int curr = grid[i][j];
                if(!hs.contains(curr)){
                    hs.add(curr);
                } else{
                    rep = curr;
                }
            }
        }
        int i=0;
        for(int num: hs){
            i++;
            if(num!=i){
                miss = i;
                break;
            }
        }
        if (miss == -1) miss = n*n;
        ans[0] = rep;
        ans[1] = miss;

        return ans;
    }
}