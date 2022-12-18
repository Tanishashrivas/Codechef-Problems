/* Ques:https://www.codechef.com/problems/PPSUM */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Puppy_and_Sum
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc= new Scanner(System.in);
	int t=  sc.nextInt();
	while(t-->0){
	    int d=  sc.nextInt();
	   	int n=  sc.nextInt();
	   	int sum=0,temp;
	   	
	   	for(int i=1;i<=n;i++)
	   	sum+=i;
	   	do{
	   	    d--;
	   	    if(d>0){
	   	       temp=sum;
	   	       sum=0;
	   	   for(int j=1;j<=temp;j++)
	   	   sum+=j;
	   	}
	   }while(d>0);
	   	
	   	System.out.println(sum);
	}
	}
}
