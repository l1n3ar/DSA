class Solution:
    def PredictTheWinner(self, nums: List[int]) -> bool:

        score_ = float("-inf")
        m = {}

        def score(i,j,a):

            nonlocal score_

            if (i,j) in m:
                return m[(i,j)]

            if i > j : return 0
            

            sLeft = a[i] + min(score(i+2,j,a),score(i+1,j-1,a))
            sRight = a[j] + min(score(i+1,j-1,a),score(i,j-2,a))

            sCurr = max(sLeft,sRight)

            m[(i,j)] = sCurr

            return sCurr


        score_ = score(0,len(nums)-1,nums)

        return score_ >= sum(nums) - score_
