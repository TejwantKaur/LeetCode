class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      int l=0; 
      int rt = arr.length-1;
      while(l<=rt){
        int mid = l+(rt-l)/2;
        if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]) return mid;
        if(arr[mid]<arr[mid+1]) l=mid+1;
        else rt = mid-1;
      }
      return -1;
    }
}