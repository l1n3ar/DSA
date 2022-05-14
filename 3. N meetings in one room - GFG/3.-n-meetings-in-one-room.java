// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Meeting implements Comparable<Meeting>{
    int start;
    int end;
    
    Meeting(int start, int end){
        this.start = start;
        this.end = end;
    }
    
    public int compareTo(Meeting m){
        return this.end - m.end;
    }
}




class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        
        ArrayList<Meeting> a = new ArrayList<>();
        
        for(int i = 0;i<n;i++){
            a.add(new Meeting(start[i], end[i]));
        }
        
        Collections.sort(a);
        
        int res = 1;
        Meeting previous = a.get(0);
        
        for(int i = 1;i<n;i++){
            Meeting current = a.get(i);
            
            if(current.start > previous.end){
                res++;
                previous = current;
            }
        }
        
        
        
        return res;
        
    }
}
