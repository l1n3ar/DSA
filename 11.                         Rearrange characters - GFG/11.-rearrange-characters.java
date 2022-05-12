// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.parseInt(br.readLine());
			while (t-- > 0) {
				String str = br.readLine();
				String result = new Solution().rearrangeCharacters(str);
				System.out.println(checker(str, result));
			}
		} catch (Exception e) {

		}
	}
	public static int checker(String str, String pat){
	    int[]freq=new int[26];
        if(str.length()!=pat.length())
            return 0;
        for(int i=0;i<str.length();i++)
        {
            freq[str.charAt(i)-97]--;
            if(pat.charAt(i)<97 || pat.charAt(i)>122)
                return 0;
            freq[pat.charAt(i)-97]++;
        }
        for(int i=0;i<26;i++)
            if(freq[i]!=0)
                return 0;
        for(int i=0;i<pat.length()-1;i++)
            if(pat.charAt(i)==pat.charAt(i+1))
                return 0;
        return 1;
	}
}
// } Driver Code Ends


class Pair {
        char ch;
        int f;
        
        public Pair(char ch, int f){
            this.ch = ch;
            this.f = f;
        }
        
    }

class Solution
{
    
    
    //Function to rearrange the characters in a string such that 
    //no two adjacent characters are same.
    static String rearrangeCharacters(String str)
    {
		// Your code here
		StringBuilder res = new StringBuilder();
		int[] frequency = new int[26];
		for(int i = 0; i <str.length();i++){
		    char current = str.charAt(i);
		    frequency[current - 'a']++;
		}
		
		PriorityQueue<Pair> pq = new PriorityQueue<>((p1,p2) -> p2.f - p1.f);
		
		for(int i = 0;i<26;i++){
		    if(frequency[i] > 0) pq.add(new Pair((char)('a' + i), frequency[i]));
		}
		
		Pair previous = new Pair('#', -1);
		
		while(!pq.isEmpty()){
		    
		    Pair current = pq.peek();
		    pq.poll();
		   res.append(current.ch);
		    
		    if(previous.f > 0) pq.add(previous);
		    
		    (current.f)--;
		    previous = current;
		    
		}
		
		return res.toString();
		
		
	}
}
