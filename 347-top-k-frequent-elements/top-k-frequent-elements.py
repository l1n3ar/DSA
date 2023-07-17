from collections import defaultdict
class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        
        res = []
        map_ = defaultdict(int)

        for num in nums:
            map_[num]+=1
        


        map_ = sorted(map_.items(),key = lambda x : x[1],reverse = True)
        
        for i in range(k):
            res.append(map_[i][0])
        
        return res

        