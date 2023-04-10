//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            int a[] = new int[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(inputLine[i]);
            }
            
            Solution obj = new Solution();
            obj.segregateElements(a, n);
            
            for(int i=0;i<n;i++)
            System.out.print(a[i]+" ");
            
            System.out.println();
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        // int last = n-1;
        // int i=0;
        // while(i<=last){
        //     int rot = n-1-i;
        //     if(arr[i]<0){
        //       reverse(i,n-1,arr);
        //       reverse(i,i+rot-1,arr);
        //       reverse(i+rot,n-1,arr);
        //       last--; 
        //     }
        //     else {
        //         i++;
        //     }
        // }
        // for(int j=0; j<n; j++){
        //     System.out.print(arr[j]+" ");
        // }
        
        int i=0;
        int j=n-1;
        int f =0;
        int s = n-1;
        int []ans = new int [n];
        while(i<n && j>=0){
            if(arr[i]>=0){
                ans[f] = arr[i];
                f++;
            }
            if(arr[j]<0){
                ans[s] = arr[j];
                s--;
            }
            i++;
            j--;
        }
        
        // System.out.println();
        for(int k=0; k<n; k++){
            arr[k] = ans[k];
            // System.out.print(ans[k]+" ");
        }
        // System.out.println();
    }
    // private void reverse(int s, int e, int []arr){
    //     while(s<e){
    //         int temp = arr[s];
    //         arr[s] = arr[e];
    //         arr[e] = temp;
    //         s++;
    //         e--;
    //     }
    // }
}