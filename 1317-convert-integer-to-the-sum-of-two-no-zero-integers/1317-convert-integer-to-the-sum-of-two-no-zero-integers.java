class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] arr = new int[2];

        int half = n/2;
        arr[0] = half;
        
        if(n%2 != 0) arr[1] = half+1;
        else arr[1]= half;
        
        

        return arr; 
        
    }
}