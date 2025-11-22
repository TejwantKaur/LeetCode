class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;

        boolean arr[] = new boolean[(n*n) + 1];
        int rep = -1; int miss = -1; 
        for(int[] row: grid){
            for(int r: row){
                if(arr[r] == false)
                    arr[r] = true;
                else 
                    rep = r;
            }
        }
        for(int i=1; i<arr.length; i++){
            if(arr[i]==false){
                miss = i;
                break;
            }
        }
        return new int[] {rep, miss};
    }
}