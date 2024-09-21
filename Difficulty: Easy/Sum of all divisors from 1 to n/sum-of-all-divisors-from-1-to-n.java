//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
            Solution ob = new Solution();
            long ans  = ob.sumOfDivisors(N);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    
    static long sumOfDivisors(int N){
    //     // code here
    //     int arr[]=new int[N+1];
    //     long sum=0;
    //     for(int i=1;i<=N;i++){
    //         for (int j = i; j <= N; j +=i) {
    //             arr[j] += i;
    //         }
            
    //     }
    //     int i=1;
    //     long newSum=0;
    //     while(i<=N){
    //         newSum+=arr[i];
    //         i++;
    //     }
    //     return newSum;
    long totalSum = 0;
        
        // Iterate over each number 'd' and consider it as a divisor
        for (int d = 1; d <= N; d++) {
            // Add 'd' multiplied by how many multiples of 'd' there are
            totalSum += d * (N / d);
        }
        
        return totalSum;
    }
}