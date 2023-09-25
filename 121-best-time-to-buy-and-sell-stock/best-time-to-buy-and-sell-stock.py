class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        result = 0
        current_lowest = float("inf")

        for price in prices:
            current_profit = 0

            current_lowest = min(price,current_lowest)
            current_profit = price - current_lowest

            result = max(current_profit,result)

        return result

            
