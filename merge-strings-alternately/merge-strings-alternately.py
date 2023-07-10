class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:

        if word1 is None or word1 == "" : return word2
        if word2 is None or word2 == "" : return word1

        iw1 = 0
        iw2 = 0
        l1 = len(word1)
        l2 = len(word2)

        res = ""

        while (iw1 < l1 and iw2 < l2):

            res+=word1[iw1]
            res+=word2[iw2]
            iw1+=1
            iw2+=1
        
        while (iw1 < l1):
            res+=word1[iw1]
            iw1+=1

        
        while (iw2 < l2):
            res+=word2[iw2]
            iw2+=1

        
        return res