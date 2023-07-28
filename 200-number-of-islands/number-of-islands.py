class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:

        count = 0
        rows,cols = len(grid),len(grid[0])

        dr = [1,-1,0,0]
        dc = [0,0,1,-1]

        visited = [[False for _ in range(cols)] for _ in range(rows)]


        def travel(r,c):

            visited[r][c] = True

            for i in range(4):

                rr = r + dr[i]
                cc = c + dc[i]

                if rr < 0 or cc < 0 or rr >= rows or cc >= cols or visited[rr][cc] or grid[rr][cc] == '0' : continue

                travel(rr,cc)                

        for r in range(rows):
            for c in range(cols):

                if grid[r][c] == '1' and not visited[r][c]:
                    count+=1
                    travel(r,c)
                    
        


        return count
        

