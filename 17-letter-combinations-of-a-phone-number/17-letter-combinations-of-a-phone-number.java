class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans  = new ArrayList<>();
         if(digits.isEmpty()){
            return ans;
        }
         ans = number1("",digits);
        return ans;
    
    }
     static ArrayList<String> number1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit  = up.charAt(0)-'0';//converts '2' into 2
         int s  = (digit-2)*3;
         int e = (digit-1)*3;
         if(digit==7){
             e=e+1;
         }
         if(digit==9){
             s=s+1;
              e=e+2;
         }
         if(digit==8){
            s=s+1;
            e=e+1;
        }
        ArrayList<String> ans= new ArrayList<>();
        for(int i =s;i<e;i++){
            char ch = (char)('a'+i);
            ans.addAll(number1(p+ch,up.substring(1)));
        }
       return ans;
    }
}