class Solution:
    def minSpeedOnTime(self, dist: List[int], hour: float) -> int:
	
		# helper returns required time to reach the office given a speed
        def getRequiredTime(speed):
            time = sum([ceil(d/speed) for d in dist[:-1]])
            time += dist[-1]/speed
			
            return time
        
        dec = hour % 1 or 1 # decimal part of the `hour`
        lo, hi = 1, ceil( max(dist) / dec ) # min and max speed
		
        res = -1
    
        while lo <= hi:
            mid = (lo + hi) // 2
            
            time = getRequiredTime(mid)
            if time == hour:
                return mid
            
            if time < hour:
                res = mid
                hi = mid - 1
            else:
                lo = mid + 1
            
        return res