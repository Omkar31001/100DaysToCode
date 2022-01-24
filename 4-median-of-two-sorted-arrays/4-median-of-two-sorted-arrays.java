class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        double med=0;
        int[] target = new int[m+n];
        //Case when one of the array is empty
        if(m==0){
            if(n%2==0){
                med = nums2[n/2] + nums2[n/2 -1];
                med=med/2;
            }else{
                med=nums2[n/2];
            }
            return med;
        }else if(n==0){
             if(m%2==0){
                med = nums1[m/2] + nums1[m/2 -1];
                med=med/2;
            }else{
                med=nums1[m/2];
            }
            return med;

        }else{  
            //Normal Case 
            int i=0,j=0,k=0;
            while(i<m &&  j<n){
              if(nums1[i]<nums2[j]){
                target[k++]=nums1[i++];
             }else{
                  target[k++]=nums2[j++];
                  
              }
            }
            while(i<m){
              target[k++]=nums1[i++];
            }
            while(j<n){
              target[k++]=nums2[j++];
            }
            int a=m+n;
         if(a%2==0){
                med = target[a/2] + target[a/2 -1];
                med=med/2;
            }else{
                med=target[a/2];
            }
            
            
        }
        
        
        return med;
    }
}

