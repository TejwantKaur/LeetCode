public class Q9_TrappedWater{
    public static int MaxTrappedWater(int[] arr){
        int l = arr.length;
        int[] leftMax = new int [l];
        int[] rightMax = new int [l];

        leftMax[0] = arr[0];
        rightMax[l-1] = arr[l-1];

        for(int i=1; i<l; i++){
            leftMax[i] = Math.max(leftMax[i-1], arr[i]);
        }
        for(int i=l-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], arr[i]); 
        }
        int trappedWater = 0;
        for(int i=0; i<l; i++){
            int waterlevel = Math.min(rightMax[i], leftMax[i]);
            trappedWater += waterlevel - arr[i]; 
        }
        return trappedWater;

    } 
    public static void main(String args[]){
        int arr[] = {4,2,0,3,2,5};
        boolean b = false;
        System.out.println(b);

        System.out.println(MaxTrappedWater(arr));
    }
}