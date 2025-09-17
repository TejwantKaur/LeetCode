class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length; 

        int minBuy = prices[0];
        int max = 0;

        for(int i=0; i<n; i++){
            if(minBuy<prices[i]){
                int profit = prices[i]-minBuy;
                max = Math.max(max, profit);
            }
            else minBuy = prices[i];
        }
        return max;
    }
}