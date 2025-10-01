class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {

        int drink = numBottles;

        while(numBottles>=numExchange){
            int curr = (numBottles/numExchange);
            drink += curr;
            numBottles = curr + (numBottles%numExchange);
        }
        return drink;
    }
}