class Solution {
    public char findKthBit(int n, int k) {
        return helper("0",n,k);
    }
    //helper function
    static char helper(String val,int n,int k){
       if(n==1){
           return val.charAt(k-1);
       }
        val  = val + "1" + reverseinverse(val);
        return helper(val,--n,k);
    }
    //inverse function
     static String reverseinverse(String str){
         char[] val = str.toCharArray();
         StringBuilder sb = new StringBuilder("");
       for(char c : val){
           if(c=='0'){
               sb.append('1');
           }else{
               sb.append('0');
           }
       }
        return sb.reverse().toString();
    }
    
    
    
   
}