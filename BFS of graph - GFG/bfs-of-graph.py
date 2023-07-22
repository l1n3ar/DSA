#User function Template for python3

from typing import List
from queue import Queue

from collections import deque
class Solution:
    #Function to return Breadth First Traversal of given graph.
    def bfsOfGraph(self, V: int, adj: List[List[int]]) -> List[int]:
        # code here
        
        visited = [False] * V
        res = []
        q = deque()
        
        def bfs(graph,vertex):
            
            q.append(vertex)
            
            while q:
                
                current_vertex = q.popleft()
                if visited[current_vertex] : continue
                
                visited[current_vertex] = True
                res.append(current_vertex)
                
                for nbr in graph[current_vertex]:
                    q.append(nbr)
        
        
        
        bfs(adj,0)
        return res


#{ 
 # Driver Code Starts


if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		V, E = map(int, input().split())
		adj = [[] for i in range(V)]
		for _ in range(E):
			u, v = map(int, input().split())
			adj[u].append(v)
		ob = Solution()
		ans = ob.bfsOfGraph(V, adj)
		for i in range(len(ans)):
		    print(ans[i], end = " ")
		print()
        

# } Driver Code Ends