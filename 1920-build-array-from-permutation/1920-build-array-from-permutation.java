class Solution {
    public int[] buildArray(int[] nums) {
    int  m = nums.length;
	
	for (int i = 0; i < m; i++)
		nums[i] += m * (nums[nums[i]] % m);
		
	for (int i = 0; i < m; i++)
		nums[i] /= m;
		
	return nums;
    }
}