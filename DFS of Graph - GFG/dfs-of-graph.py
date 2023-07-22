#User function Template for python3

class Solution:
    
    #Function to return a list containing the DFS traversal of the graph.
    def dfsOfGraph(self, V, adj):
        # code here
        res = []
        visited = [False] * V
        
        def dfs(graph, vertex):
            
            visited[vertex] = True
            res.append(vertex)
            
            for nbr in graph[vertex]:
                if not visited[nbr] : dfs(graph,nbr)
        
        
        for vertex in range(V):
            if not visited[vertex] : dfs(adj,vertex)
        
        
        return res
            
            


#{ 
 # Driver Code Starts

if __name__ == '__main__':
    T=int(input())
    while T>0:
        V,E=map(int,input().split())
        adj=[[] for i in range(V+1)]
        for i in range(E):
            u,v=map(int,input().split())
            adj[u].append(v)
            adj[v].append(u)
        ob=Solution()
        ans=ob.dfsOfGraph(V,adj)
        for i in range(len(ans)):
            print(ans[i],end=" ")
        print()
        T-=1
# } Driver Code Ends