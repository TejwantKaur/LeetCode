class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = nums1.length-1;
        int pt1 = m-1; 
        int pt2 = n-1;

        while(pt1 >= 0 && pt2 >= 0){
            if(nums1[pt1] > nums2[pt2])
                nums1[l--] = nums1[pt1--];
            else 
                nums1[l--] = nums2[pt2--];
        }

        // while(pt1 >= 0)
        //     nums1[l--] = nums1[pt1--];
        // not required as nums1 already sorted

        while(pt2 >= 0)
            nums1[l--] = nums2[pt2--];

    }
}