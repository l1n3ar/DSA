class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        if n==0:
            return True
        count = n
        for i in range(len(flowerbed)):
            current = flowerbed[i]
            if current==0 and (i==0 or flowerbed[i-1]==0) and (i==len(flowerbed)-1 or flowerbed[i+1]==0):
                flowerbed[i] = 1
                count-=1
                if count == 0:
                    return True
        return False
        