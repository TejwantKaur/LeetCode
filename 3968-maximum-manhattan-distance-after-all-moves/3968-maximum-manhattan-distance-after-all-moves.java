class Solution {
    public int maxDistance(String moves) {
      int n=moves.length();
      if (n==1 || n==0) return n;

      // int arr[] = new int[2];
      // 0l, 1r, 2u, 3d;
      int x=0, y=0;

      int dis=0;
      for(int i=0; i<n; i++){
        char ch = moves.charAt(i);
        if(ch=='L') x++;
        else if(ch=='R') x--;
        else if(ch=='U') y++;
        else if(ch=='D') y--;
        else dis++;
      }

      dis+=(Math.abs(x)+ Math.abs(y));
      return dis;
        
    }
}