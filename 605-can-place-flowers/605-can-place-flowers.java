class Solution {
    public boolean canPlaceFlowers(int[] flo, int n) {
      int k = flo.length;
        int count=0;
      
        for(int i=0;i<k;i++){
            int prev=(i==0 || flo[i-1]==0)?0:1;
            int nxt=(i==k-1 || flo[i+1]==0)?0:1;
            if(prev==0 && nxt==0 && flo[i]==0){
                flo[i]=1;
                n--;
            }
        }
       return n<=0;
    }
}