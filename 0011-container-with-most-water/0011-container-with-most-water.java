class Solution {
    public int maxArea(int[] height) {
      int n = height.length;
      int left = 0; 
      int rt = n-1;

      int max = 0;
      while(left < rt){
        int len = Math.min(height[left],height[rt]);
        int breadth = (rt - left);
        int area = len*breadth;
        max = Math.max(area, max);

        while(left< rt && height[left] <= len) left++;
        while(left< rt && height[rt] <= len) rt--;
      }
      return max;
        
    }
}