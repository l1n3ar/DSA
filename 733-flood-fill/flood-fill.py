class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:

        dr = [1,-1,0,0]
        dc = [0,0,1,-1]

        rows,cols = len(image),len(image[0])

        curr = image[sr][sc]

        def dfs(r,c):

            if image[r][c] == color : return

            image[r][c] = color

            for i in range(4):
                
                rr = r + dr[i]
                cc = c + dc[i]

                if cc < 0 or rr < 0 or rr >= rows or cc >= cols : continue
                if image[rr][cc] != curr : continue

                dfs(rr,cc)
        
        dfs(sr,sc)
        return image



