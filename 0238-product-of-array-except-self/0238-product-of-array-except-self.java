class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n]; ans[0]=1;
        // int suf[] = new int[n]; suf[n-1]=1;

        // [_,1,2,6]  [1,2,3,4]
        for(int i=1; i<n; i++)
            ans[i] = nums[i-1] * ans[i-1];

        // [24,12,4,_]
        int suf=1;
        for(int i=n-2; i>=0; i--){
            suf *= nums[i+1];
            ans[i] *= suf;
        }
            // suf[i] = nums[i+1] * suf[i+1];

        // int[] res = new int[n];
        // for(int i=0; i<n; i++){
        //     res[i] = pre[i] * suf[i];
        //     ans[i] *=
        // }
        return ans;
        
    }
}