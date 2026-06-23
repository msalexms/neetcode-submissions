class Solution {
    public int maxProfit(int[] prices) {

        Integer profit = 0;


        int l = 0;
    

        for(int r = 0; r < prices.length ; r ++){

            
            while(prices[l] > prices[r]){

                l ++;

            }

            int tempProfit = prices[r] - prices[l];

            if(tempProfit > profit) profit = tempProfit;

        }





    return profit;
        
    }
}
