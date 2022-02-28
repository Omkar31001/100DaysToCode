class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int ans  = ways(nums,0,target);
        return ans;
        
}
    static int ways(int[] arr,int index,int target){
        if(index==arr.length){
            if(target==0){
                return 1;
            }else{
                return 0;
            }
        }
        int pos = arr[index];
        int neg = -arr[index];
        int left = ways(arr,index+1,target-pos);
        int right = ways(arr,index+1,target-neg);
        left+=right;
        return left;
    }
}