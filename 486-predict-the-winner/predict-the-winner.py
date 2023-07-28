class Solution:
    def PredictTheWinner(self, nums: List[int]) -> bool:

        score_ = float("-inf")

        def score(i,j,a):

            nonlocal score_

            if i > j : return 0
            

            sLeft = a[i] + min(score(i+2,j,a),score(i+1,j-1,a))
            sRight = a[j] + min(score(i+1,j-1,a),score(i,j-2,a))

            sCurr = max(sLeft,sRight)

            return sCurr


        score_ = score(0,len(nums)-1,nums)

        return score_ >= sum(nums) - score_
