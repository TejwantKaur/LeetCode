public class maxSubArray {
    public static int MaxSumArray(int[] arr){
        int MaxSum = arr[0];
        int currSum = 0;

        for(int i=0; i<arr.length; i++){
            currSum += arr[i];

            if(MaxSum > 0){
                if(currSum < 0){
                    currSum = 0;
                }
            }
            currSum = Math.max(currSum, arr[i]);
            MaxSum = Math.max(MaxSum,currSum);
        }
        return MaxSum;
    }
    public static void main(String args[]){
        int arr[] = {-2,-3,4,-1,-2,1,5,-3}; //
        int arr1[] = {-2,1,-3,4,-1,2,1,-5,4};
        int arr2[] = {5,4,-1,7,8};
        int arr3[] = {-1};
        int arr4[] = {1};
        System.out.println(MaxSumArray(arr));
        System.out.println(MaxSumArray(arr1));
        System.out.println(MaxSumArray(arr2));
        System.out.println(MaxSumArray(arr3));
        System.out.println(MaxSumArray(arr4));
    }
    
}
