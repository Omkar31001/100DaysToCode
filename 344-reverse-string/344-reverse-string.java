class Solution {
    public void reverseString(char[] s) {
        int st = 0;
        int e = s.length;
        int mid = st+(e-st)/2;
        reversed(s,mid,st,e-1);
    }
    public void reversed(char[] s , int mid,int index,int last)
    {    if(index==mid)
        {
             return;
        }
     
     char temp = s[index];
     s[index] = s[last];
     s[last] = temp;
     
     reversed(s,mid,index+1,last-1);
    }
}