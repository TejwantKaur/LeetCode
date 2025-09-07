class Solution {
    public int[] sumZero(int n) {
        int newArr[] = new int[n];

        for(int i=0; i<n; i++){
            newArr[i] = 2*i - n + 1; 
        }
        return newArr;
    }
}