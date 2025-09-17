class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length; 

        int minBuy = prices[0];
        int maxSell = -1;
        int p = 0;
        int max = 0;

        for(int i=1; i<n; i++){
            int prevBp = minBuy, prevSp = maxSell;
            if (prevSp==-1) prevSp = prevBp;
            minBuy = Math.min(prevBp,prevSp);
            maxSell = prices[i];
            p = maxSell-minBuy;
            max = Math.max(p,max);
        }
        return max;
    }
}