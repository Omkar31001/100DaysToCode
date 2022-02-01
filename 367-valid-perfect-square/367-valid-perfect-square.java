class Solution {
    public boolean isPerfectSquare(int num) {
       int ans =0;
        int start = 1,end = num;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(num/mid >  mid)
                start = mid+1;
            else if(num/mid < mid)
                end=mid-1;
            else if(num/mid == mid){
                ans =mid;
                break;
            }
    }
        return ans*ans == num;
    }
}