class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int initialValue = 0;
       for(int i=0;i<operations.length;i++){
           String sc = operations[i];
           if(sc.charAt(0)=='+' || sc.charAt(1)=='+'){
               initialValue++;
           }else{
               initialValue--;
           }
       }
        return initialValue;
    }
}