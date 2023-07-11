class Solution:
    def arrangeCoins(self, n: int) -> int:
        stairs = 0
        stair_count = 0
        remaining_coins = n

        while(remaining_coins > 0):
            stairs+=1

            if remaining_coins < stairs:return stair_count
            remaining_coins-=stairs
         
            stair_count+=1


        return stair_count
        