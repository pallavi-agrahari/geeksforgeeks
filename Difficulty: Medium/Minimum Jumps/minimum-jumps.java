//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            System.out.println(new Solution().minJumps(arr));
            // System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    
    static int minJumps(int[] arr) {
        // your code here
        int n = arr.length;
        
        // If array has only one element, no jumps are needed
        if (n == 1) {
            return 0;
        }
        
        // If the first element is 0, we can't move anywhere
        if (arr[0] == 0) {
            return -1;
        }
        
        // Initialize variables
        int maxReach = arr[0];  // The farthest index we can reach so far
        int step = arr[0];      // Steps we can take within the current range
        int jumps = 1;          // Number of jumps
        
        for (int i = 1; i < n; i++) {
            // If we have reached the last index
            if (i == n - 1) {
                return jumps;
            }
            
            // Update the maximum reach
            maxReach = Math.max(maxReach, i + arr[i]);
            
            // Use a step to get to the current index
            step--;
            
            // If no more steps are left
            if (step == 0) {
                // We need to make another jump
                jumps++;
                
                // Check if we can move forward
                if (i >= maxReach) {
                    return -1;
                }
                
                // Reinitialize steps to the number of steps to reach maxReach from i
                step = maxReach - i;
            }
        }
        
        return -1;
    }
}