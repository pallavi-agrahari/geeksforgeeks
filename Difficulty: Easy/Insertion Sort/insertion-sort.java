//{ Driver Code Starts
import java.util.*;
import java.lang.Math;

class Sorting
{
	
	static void printArray(int arr[],int size)
	{
		int i;
		for(i=0;i<size;i++)
		System.out.print(arr[i]+" ");
	    System.out.println();
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
		
			for(int i=0;i<n;i++)
			a[i]= sc.nextInt();
			
			 new Solution().insertionSort(a,n);
			 printArray(a,n);
			
		t--;
		}
		
	}
}
// } Driver Code Ends


class Solution
{
  static void insert(int arr[],int i)
  {
       // Your code here
    //   for(i=0;i<arr.length;i++){
    //       int j=i;
    //       while(j>0 && arr[j-1]>arr[j]){
    //           int temp=arr[j];
    //           arr[j]=arr[j-1];
    //           arr[j-1]=temp;
    //           j--;
    //       }
    //   }
    //   return;
    int count=0;
     for(i=1;i<arr.length;i++){
         
          if(arr[i]<arr[i-1]){
              int temp=arr[i];
              arr[i]=arr[i-1];
              arr[i-1]=temp;
              count++;
          }
      }
      if(count==0) return;
      insert(arr,i+1);
     
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n)
  {
      //code here
      insert(arr,0);
  }
}