class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int st=0; int end=arr.length-1;

        while(st<end){
            int mid=(st+end)/2;
            if(arr[mid] < arr[mid+1]) st=mid+1; // peak on right
            else end = mid;
        }
        

        // for(int i=1; i<arr.length; i++){
        //     if (arr[i]<arr[i-1]) return i-1;
        // }
        return st;
    }
}