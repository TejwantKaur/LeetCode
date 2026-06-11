class Solution {

    public double power(double x, int n){
      if(n==0) return 1;

      double half = power(x, n/2);
      double halfSq = half * half;

      // odd
      if(n%2 != 0)
        return x * halfSq;

      return halfSq;
    }

    public double myPow(double x, int n) {
      if (n<0)
        return 1.0 / power(x, -n);

      return power(x, n);
        
    }
}