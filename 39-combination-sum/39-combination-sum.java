class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, candidates, target, ans, new ArrayList<>() ) ;
        return ans;
    }
     private static void findCombination(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        if(ind == arr.length){
            return;
        }
        //Pick
        if(arr[ind] <= target){
            ds.add(arr[ind]);
            findCombination(ind , arr, target-arr[ind] , ans, ds);
            ds.remove(ds.size()-1);
        }
        // Not Pick
        findCombination(ind+1 , arr , target , ans, ds);
        return;
    }
}