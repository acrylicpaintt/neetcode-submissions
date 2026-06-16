class Solution {
    public int maxProfit(int[] prices) {
        int currProfit = 0;
        int currBuyFor = prices[0];
        for (int i = 1 ; i < prices.length; i++) {
            if (i != prices.length - 1 && prices[i] < currBuyFor) { 
                currBuyFor = prices[i];
            }
            else {
                currProfit = Math.max(prices[i] - currBuyFor, currProfit);
            }
        }
        return currProfit;
    }
}
