// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for(int i = 0; i < V+1; i++)
                list.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++)
            {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
                list.get(v).add(u);
            }
            int X = sc.nextInt();
            
            Solution ob = new Solution();
            
            System.out.println(ob.nodeLevel(V,list,X));
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

 class Node{
        int value;
        int level;
        
        Node(int value, int level){
            this.value = value;
            this.level = level;
        }
    }

class Solution
{
    
   
    //Function to find the level of node X.
    int nodeLevel(int V, ArrayList<ArrayList<Integer>> adj, int X)
    {
        // code here
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(0,0));
        boolean[] visited = new boolean[V];
        
        while(!q.isEmpty()){
            Node current = q.poll();
           if(current.value == X) return current.level;
            if(visited[current.value]) continue;
       
           else{
               visited[current.value] = true;
                 for(int nbr : adj.get(current.value)){
                q.add(new Node(nbr, current.level+1));
            }
           }
          
        }
        
        
        return -1;
        
    }
}