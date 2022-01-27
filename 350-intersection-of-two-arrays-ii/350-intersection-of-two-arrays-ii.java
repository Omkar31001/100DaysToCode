class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
      Arrays.sort(nums1);
       Arrays.sort(nums2);
        int pointer1 = 0;
        int pointer2 = 0;
        int size = 0;
        List<Integer> list = new ArrayList<>();
        while(pointer1 < nums1.length && pointer2 < nums2.length){
            if(nums1[pointer1] == nums2[pointer2]){
                list.add(nums1[pointer1]);
                size++;
                pointer1++;
                pointer2++;
            } else if(nums1[pointer1] < nums2[pointer2]){
                pointer1++;
            } else {
                pointer2++;
            }
        }
        int pointer = 0;
        int[] result = new int[size];
        for(int i : list){
            result[pointer] = i;
            pointer++;
        }
        return result;  
    }
}