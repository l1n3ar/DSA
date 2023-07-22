#User function Template for python3

from typing import List
from queue import Queue
from collections import deque

class Solution:
    #Function to return Breadth First Traversal of given graph.
    def bfsOfGraph(self, V: int, adj: List[List[int]]) -> List[int]:
        # code here
        
        
        if not adj : return []
        
        q = deque()
        res = []
        visited = [False] * V
        
        
        def travel(graph,src):
            
            visited[src] = True
            q.append(src)
            
            while q:
                
                vertex = q.popleft()
                res.append(vertex)
                
                for nbr in graph[vertex]:
                    if not visited[nbr] : 
                        q.append(nbr)
                        visited[nbr] = True
        

        travel(adj,0)
        
        
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