from collections import deque
from typing import List

class Pair:
    def __init__(self, vertex, level):
        self.vertex = vertex
        self.level = level

class Solution:
    def isBipartite(self, graph: List[List[int]]) -> bool:
        q = deque()
        visited = [0] * len(graph)
        
        def findOddCycle(graph, src):
           

            q.append(Pair(vertex=src, level=1))

            while q:
               

                vertex = q.popleft()



                if visited[vertex.vertex] != 0 and visited[vertex.vertex] != vertex.level:
                    return True
                else:
                    visited[vertex.vertex] = vertex.level

                for nbr in graph[vertex.vertex]:
                    if visited[nbr]==0 : q.append(Pair(vertex=nbr, level=vertex.level + 1))

            return False

        for i in range(len(graph)):
            if visited[i] == 0:
                oddCycle = findOddCycle(graph, i)
  
                if oddCycle:
                    return False

        return True
