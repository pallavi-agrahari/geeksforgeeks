//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }
            Solution ob = new Solution();
            int res = ob.findKRotation(arr);
            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int low=0;
        int high=arr.size()-1;
        int ans=Integer.MAX_VALUE;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr.get(low)<=arr.get(high)){
                ans=Math.min(ans, arr.get(low));
                index=low;
                break;
            }
            if(arr.get(low)<=arr.get(mid)){
                ans=Math.min(ans, arr.get(low));
                index=low;
                low=low+1;
            }
            else{
                ans=Math.min(ans,arr.get(mid));
                index=mid;
                high=high-1;
            }
        }
        return index;
    }
}