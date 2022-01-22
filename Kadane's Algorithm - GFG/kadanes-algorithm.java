// { Driver Code Starts
import java.io.*;

class Main {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    //size of array
		    int n = Integer.parseInt(br.readLine().trim());
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    //adding elements
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]);
		    }
		    
		    Solution obj = new Solution();
		    
		    //calling maxSubarraySum() function
		    System.out.println(obj.maxSubarraySum(arr, n));
		}
	}
}

// } Driver Code Ends


class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // long MaxSum = 0;
        // long CurrSum =0;
        // for(int  i=0;i<n;i++){
        //     CurrSum+=arr[i];
        //     if(CurrSum<0){
        //         CurrSum=0;
        //     }
        //   MaxSum = Math.max(CurrSum,MaxSum);
            
        // }
        // return MaxSum;
         int maxsum = arr[0];
       int sum=0;
       for(int i =0 ; i<n ;i++) {
           sum += arr[i];
           maxsum = Math.max(sum,maxsum);
           if(sum<0) sum=0;
       }
       return maxsum;
        
    }
    
}

