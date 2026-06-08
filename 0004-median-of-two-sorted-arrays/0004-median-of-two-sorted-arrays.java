class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int n= nums1.length; 
      int m= nums2.length;
      int[] ans = new int[m+n];

      int max= Math.max(m,n);
      int idx = 0;
      int left = 0;
      int rt = 0;
      while(left<n && rt<m){
        if(nums1[left]<nums2[rt]){
          ans[idx++] = nums1[left];
          left++;
        } else {
          ans[idx++] = nums2[rt];
          rt++;
        } 
      }

      while(left<n){
        ans[idx++] = nums1[left];
          left++;
      }

      while(rt<m){
        ans[idx++] = nums2[rt];
        rt++;
      }

      // even
      int l = ans.length;
      double median = 0;
      if(l%2==0){
        int mid = l/2;
        median = (ans[mid]+ans[mid-1])/2.0;
      }
      // odd
      else {
        median = ans[l/2];
      }
      return median;
    }
}