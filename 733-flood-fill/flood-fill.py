class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:

        dr = [1,-1,0,0]
        dc = [0,0,1,-1]

        rows,cols = len(image),len(image[0])

        curr = image[sr][sc]

        def dfs(r,c):

            if r < 0 or c < 0 or r >= rows or c >= cols or image[r][c] == color or image[r][c] != curr : return
           
            image[r][c] = color

            for i in range(4):
                
                rr = r + dr[i]
                cc = c + dc[i]

                dfs(rr,cc)
        
        dfs(sr,sc)
        return image



