//{ Driver Code Starts
import java.util.*;

// Define MyStack class here

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Flush the newline character left by nextInt
        while (T-- > 0) {
            MyStack sq = new MyStack();
            String line = scanner.nextLine();
            Scanner ss = new Scanner(line);
            List<Integer> nums = new ArrayList<>();
            while (ss.hasNextInt()) {
                int num = ss.nextInt();
                nums.add(num);
            }
            int n = nums.size();
            int i = 0;
            while (i < n) {
                int QueryType = nums.get(i++);
                if (QueryType == 1) {
                    int a = nums.get(i++);
                    sq.push(a);
                } else if (QueryType == 2) {
                    System.out.print(sq.pop() + " ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}

// } Driver Code Ends


class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }
    Stack<Integer> st=new Stack<>();

    public void push(int x) {
        
        // Your Code
        st.push(x);
        return;
        
    }


    public int pop() {
        
        if(st.isEmpty()){
            return -1;
        }
        // Your Code
        return st.pop();
        
    }
}
