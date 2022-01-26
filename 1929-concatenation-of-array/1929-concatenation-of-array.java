class Solution {
    public int[] getConcatenation(int[] nums) {
         int n = nums.length;
        int[] ans  = new int[2*n];
        for(int i=0;i<n;i++){
            int j = n+i;
            ans[i] = nums[i];
            ans[j]=nums[i];
        }
        return ans;
    }
    //[1,2,1] => [1,2,1,1,2,1]
}