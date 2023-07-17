from collections import defaultdict

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        res = []
        map_ = defaultdict(list)

        for str_ in strs:
            sorted_str = ''.join(sorted(str_))
            map_[sorted_str].append(str_)
        
        return list(map_.values())



        