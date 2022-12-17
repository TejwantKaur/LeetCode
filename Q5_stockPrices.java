public class stockPrices {
    public int maxProfit(int[] prices) {
        int buyP = Integer.MAX_VALUE;
        int maxP = 0;
       
        for(int i=0; i<prices.length; i++){
            if(buyP > prices[i]){
                buyP = prices[i];
            }
            else{
                int profit = prices[i] - buyP;
                maxP = Math.max(maxP,profit); 
            }
        }
        return maxP;
    } 
}
