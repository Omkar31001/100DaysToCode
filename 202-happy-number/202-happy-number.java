class Solution {
    public boolean isHappy(int n) {
     int slow  = n;
    int fast = n;
     do{
         slow = getSumSquare(slow);
         fast = getSumSquare(getSumSquare(fast));
     }while(slow!=fast);
        
    if(slow==1){
        return true;
    }
        return false;
    }
     private int getSumSquare(int num){
         int sum=0;
         while(num!=0){
             int rem = num%10;
             sum+=rem*rem;
             num=num/10;
             
         }
         return sum;
     }
}