// { Driver Code Starts
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int k = sc.nextInt();
                    String str = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.findMaximumNum(str, k));
                }
        }
}// } Driver Code Ends




class Solution
{
static String strMax = "";
public static String findMaximumNum(String str, int k) {
   
   strMax = "";
   char [] arr = str.toCharArray();
      
   findNum(arr, k);
   
   if(strMax.isEmpty()) return str;
   
   return strMax;
}

public static void findNum(char [] arr, int k) {
 
   if(k==0) return;
   
   int size = arr.length;
    
    for(int i=0; i<size-1; i++) {
     for(int j=i+1; j<size; j++) {
      char a = arr[i];
      char b = arr[j];
      
      if(a<b) {
       char tmp = arr[i];
       arr[i] = arr[j];
       arr[j] = tmp;
              
       String toStr = String.valueOf(arr);
       
       if(toStr.compareTo(strMax) > 0){
        strMax = toStr;
       }
       
       findNum(arr, k-1);
      }
      
      if(a<b) {
       char tmp = arr[i];
       arr[i] = arr[j];
       arr[j] = tmp;
      }
     }
    }
}
}