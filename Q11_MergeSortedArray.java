public class Q11_MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        while(n>0){
           if(n==0||m==0||nums2[n-1] > nums1[m-1]){
            //    n--;
               nums1[m+n-1] = nums2[--n];
            }
            else{
                // m--;
                nums1[m+n-1] = nums1[--m];
            } 
        }
    }
    public static void print(int[]arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int nums1[] = {2,4,7,0,0,0}; int m = 3;
        int nums2[] = {3,6,7}; int n = 3;
        merge(nums1,m,nums2,n);
        print(nums1);
    }
        // while(n>0) {
        //     A[m+n-1] = (m==0||B[n-1] > A[m-1]) ? B[--n] : A[--m];
        // }  
}
