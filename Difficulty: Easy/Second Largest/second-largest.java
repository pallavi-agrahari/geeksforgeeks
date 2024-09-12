//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.print2largest(arr);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int print2largest(int[] arr) {
        // Code Here
        Arrays.sort(arr);
       int n=arr.length;
       int secondl=0;
       for(int i=n-2;i>=0;i--){
           if(arr[i]!=arr[n-1]){
               secondl=arr[i];
               return secondl;
           }
           
       }
       return -1;
    }
}