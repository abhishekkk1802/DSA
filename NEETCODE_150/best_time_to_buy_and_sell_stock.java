class Solution {
    public int maxProfit(int[] prices) {
        int mxProf =0;
        int n = prices.length;
        int sellDay = prices[n-1];
        
        for(int i=n-2;i>=0;i--){
            if(prices[i]<=sellDay){
                mxProf = Math.max(mxProf,sellDay-prices[i]);
            }else {
                sellDay = prices[i];
                
            }
        }
        return mxProf;
    }
}

Approach :- We can use a greedy approach to solve this problem. We can start from the last day and keep track of the maximum price we can sell at.
            If the current price is less than the maximum price we can sell at, we can calculate the profit and update the maximum profit.
            If the current price is greater than the maximum price we can sell at, we can update the maximum price we can sell at.

Time Complexity :- O(n)
Space Complexity :- O(1)