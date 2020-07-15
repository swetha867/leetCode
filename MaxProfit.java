package leetcode;

public class MaxProfit {
    public static int maxProfit(int[] prices) {

    if(prices == null || prices.length < 2) return 0;

    int profit=0;
    int currentBuyPrice=prices[0];

    for(int i=0;i<prices.length;i++){
        if (prices[i] < currentBuyPrice)
            currentBuyPrice = prices[i];
        else if (prices[i] - currentBuyPrice > profit)
            profit = prices[i] - currentBuyPrice;
        // currentBuyPrice = Math.min(currentBuyPrice, prices[i]);              
        //  profit=Math.max(profit,prices[i] - currentBuyPrice);
        
    }
    return profit;
    
}
public static void main(String[] args) {
    System.out.println(maxProfit(new int[]{7,6,4,5}));
}
}