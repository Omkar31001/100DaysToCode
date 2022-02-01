class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int end=numbers.length-1;
    for(int i=0;i<numbers.length;i++){
        int start=i+1; //whenever i updated start should also be
                        // updated for the repeated element
        while(start<=end){
            int mid=start+(end-start)/2;
            if(numbers[i]+numbers[mid]>target){
                end=mid-1;
            }else if(numbers[i]+numbers[mid]<target){
                start=mid+1;
            }else{
                return new int[]{i+1,mid+1};
            }
        }
        
    }       
    return new int[2] ;
    }
}