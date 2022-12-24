public class Q10_Domino_Tromino {
    public static final int MODULO = (int) Math.pow(10,9)+7; 
    public static int numTilings(int n) {
        if(n==1 || n==2){
            return n;
        }
        long[] dp = new long[n+1];
        dp[0] = 1; 
        dp[1] = 1; 
        dp[2] = 2;
        for(int i=3; i<dp.length; i++){
            dp[i] = (dp[i-1]*2 + dp[i-3]) % MODULO;
        }
        return (int)dp[n];
    }
    public static void main(String args[]){
        
        System.out.println(numTilings(30));
    }
}
