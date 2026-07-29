class Solution {
    public int maxProfit(int[] prices) {
       int maxProfit=0;
       int buyprice=prices[0];
       for(int i=0;i<prices.length;i++) {
           int currentprice=prices[i]-buyprice;
            if(currentprice>maxProfit) {
                maxProfit=currentprice;
            }
            if(prices[i]<buyprice) {
                buyprice=prices[i];
            }
    }
        return maxProfit;
    }
}