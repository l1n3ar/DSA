class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        max_profit = 0
        current_lowest = float("inf")

        for price in prices:

            current_profit = 0

            current_lowest = min(price,current_lowest)
            current_profit = price - current_lowest

            max_profit = max(current_profit,max_profit)

        return max_profit

            
