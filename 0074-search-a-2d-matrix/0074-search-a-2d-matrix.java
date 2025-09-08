class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int stRow = 0;
        int endRow= matrix.length-1;
       
        while(stRow<=endRow){
            int midRow= (stRow+endRow)/2;
            if (matrix[midRow][0] > target) endRow = midRow-1;
            else stRow = midRow+1;
            for(int i=0; i<matrix[0].length; i++){
                if (matrix[midRow][i] == target) return true;
            }
        }
        return false;
    }
}