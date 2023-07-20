from typing import List

class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        dr = [1, -1, 0, 0]
        dc = [0, 0, 1, -1]
        rows, cols = len(grid), len(grid[0])
        visited = [[False for _ in range(cols)] for _ in range(rows)]
        islands = 0

        def dfs(r, c):
            visited[r][c] = True

            for i in range(4):
                rr = r + dr[i]
                cc = c + dc[i]

                if rr < 0 or cc < 0 or rr >= rows or cc >= cols:
                    continue

                if grid[rr][cc] == '0' or visited[rr][cc]:
                    continue

                dfs(rr, cc)

        for i in range(rows):
            for j in range(cols):
                if not visited[i][j] and grid[i][j] == '1':
                    islands += 1
                    dfs(i, j)

        return islands
