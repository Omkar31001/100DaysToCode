/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test>0){
		    int a  = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int n  = sc.nextInt();
		    System.out.println(geeko(a,b,c,n));
		    test--;
		}
	}
	 static int geeko(int a,int b,int c  ,int n ){
	     if(n==1){
	         return a;
	     }
	    else if(n==2){
	        return b;
	    }else if(n==3){
	        return c;
	    }
	    return geeko(a,b,c,n-1) + geeko(a,b,c,n-2) + geeko(a,b,c,n-3);
	 }
}