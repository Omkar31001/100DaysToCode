class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> arr = new ArrayList<>();
        for(int i = 1;i<=n;i++)
            arr.add(i);
        return helper(arr, 0, k); 
    }
    public int helper(List<Integer> arr, int currIndex, int k)
    {
        if(arr.size() == 1)
            return arr.get(0);
        int nextIndex = (currIndex + k - 1)%arr.size();
        arr.remove(nextIndex);
        nextIndex = nextIndex % arr.size();
        return helper(arr, nextIndex, k);
    }
}