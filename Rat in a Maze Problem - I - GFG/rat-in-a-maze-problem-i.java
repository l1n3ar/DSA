// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    static HashSet<String> set;
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        boolean[][] visited = new boolean[n][n];
        ArrayList<String> res = new ArrayList<>();
        
        set = new HashSet<>();
        path(m,visited,0,0,n-1,n-1,"");
        
        for(String s : set){
            res.add(s);
        }
        
        Collections.sort(res);
        return res;
    }
    
    public static void path(int[][] a, boolean[][] visited, int sx, int sy, int dx, int dy, String psf){
        
        
        if(sx < 0 || sy < 0 || sx >=a.length || sy >=a.length || a[sx][sy] == 0 || visited[sx][sy]) return;
  
        
            
        visited[sx][sy] = true;
        
        if(sx == dx && sy == dy){
            set.add(psf);
        }
        
        
        path(a,visited,sx+1,sy,dx,dy,psf+'D');
        path(a,visited,sx-1,sy,dx,dy,psf+'U');
        path(a,visited,sx,sy+1,dx,dy,psf+'R');
        path(a,visited,sx,sy-1,dx,dy,psf+'L');
        
        visited[sx][sy] = false;
    }
}