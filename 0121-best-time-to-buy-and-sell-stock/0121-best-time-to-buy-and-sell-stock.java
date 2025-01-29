class Solution {
    public int maxProfit(int[] prices) {
        int buy= prices[0];
        int maxProf=0;
        for(int i=1; i<prices.length; i++)
        {
            if(buy>prices[i])
            {
                buy=prices[i];
            }
            else if(prices[i]-buy> maxProf)
            {
                maxProf=prices[i]-buy;
            }
        }
        return maxProf;
    }
}