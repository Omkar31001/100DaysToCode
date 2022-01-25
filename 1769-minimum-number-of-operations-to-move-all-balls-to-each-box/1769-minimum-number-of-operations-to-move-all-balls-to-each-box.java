class Solution {
    public int[] minOperations(String boxes) {
        char[] values = boxes.toCharArray();
        int n = values.length;
        int[] res = new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(values[i]=='1'){
                count++;
            }
        }
        int[] NumOfOnes=new int[count];
        int j=0;
        for(int i=0;i<n;i++){
            if(values[i]=='1'){
                NumOfOnes[j]=i;
                j++;
            }
        }
        for(int i=0;i<n;i++){
            int diff=0;
            for(int k=0;k<count;k++){
                diff = Math.abs(i-NumOfOnes[k]);
                res[i]+=diff;
            }
        }
        return res;
    }
}