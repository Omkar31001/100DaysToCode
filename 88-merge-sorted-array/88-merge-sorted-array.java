class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] target=  new int[m+n];
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
        for(int a=0;a<m+n;a++){
            nums1[a] =target[a];
        }
    }
}