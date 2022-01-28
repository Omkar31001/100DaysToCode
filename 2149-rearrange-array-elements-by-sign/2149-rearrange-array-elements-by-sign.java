class Solution {
    public int[] rearrangeArray(int[] nums) {
        if(nums.length==2){
            if(nums[0]<0){
            int temp = nums[0];
            nums[0] = nums[1];
            nums[1]= temp;
            return nums;
        }else{
            return nums;
        }
        }
        int n = nums.length;
        int[] res = new int[n];
        int j=1;
        int k =0;
        //loop for negative element
        for(int i=0;i<n;i++){
            if(nums[i]<0){
                res[j] = nums[i];
                j+=2;
            }else{
                res[k] = nums[i];
                k+=2;
            }
        }
    return res;    
        
    }
}