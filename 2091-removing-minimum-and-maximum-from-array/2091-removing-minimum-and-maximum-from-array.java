class Solution {
    public int minimumDeletions(int[] nums) {
        int min=0,max=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[max])
                max=i;
            if(nums[i]<nums[min])
                min=i;
        }
       
        int left=Math.max(min,max)+1;
        int right=Math.max(n-min,n-max);
        int ans=Math.min(left,right);
        left=Math.min(max+1,n-max);
        right=Math.min(min+1,n-min);
        ans=Math.min(ans,left+right);
        return ans;
    }
}