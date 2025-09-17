class Solution {
    public int maxProfit(int[] prices) {
       int buy = Integer.MAX_VALUE;
       int profit = 0;

       for(int i=0; i<prices.length;i++){
           if(buy > prices[i]){
               buy = prices[i];
           }
           int sell = prices[i] - buy;
           profit = Math.max(sell, profit);
       }
       return profit;
    }
}






















//  int buyP = Integer.MAX_VALUE;
//         int maxP = 0;
//         // int SellP = 0;

//         for(int i=0; i<prices.length; i++){
//             if(buyP > prices[i]){
//                 buyP = prices[i];
//             }
//             else{
//                 int profit = prices[i] - buyP;
//                 maxP = Math.max(maxP,profit); 
//             }
//         }
//         return maxP;