package day2;
//121. Best Time To Buy And Sell Stock
public class Stock_Buy_And_Sell {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxP = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i]<min){
                min=prices[i];
            }
            int gain = prices[i]-min;
            if(gain>maxP){
                maxP = gain;
            }
        }

        return maxP;
    }
}
