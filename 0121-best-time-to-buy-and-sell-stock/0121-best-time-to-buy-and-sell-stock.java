class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int prevbuy=prices[0]; 
        int max=0;
        for(int i=1; i<n; i++){
            int sell = prices[i];
            prevbuy = Math.min(prices[i-1],prevbuy);
            int profit = sell-prevbuy;
            max=Math.max(profit,max);
        }
        return max;
    }
}