class Solution {
    public int maxProfit(int[] prices) {
        int Profit=0;
       for(int i=0;i<prices.length-1;i++){
        if(prices[i]<prices[i+1]){
            Profit = Profit +(prices[i+1]-prices[i]);
        }
       }
       return Profit;
    }
}