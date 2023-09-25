class Solution:
    def maxProfit(self, price: List[int]) -> int:

        buy = 0
        sell = 1
        max_profit = 0

        while sell < len(price):

            if price[sell] > price[buy]:

                max_profit+=price[sell] - price[buy]
            
            buy = sell
            sell+=1
            
        return max_profit
        