/* Ques: https://www.codechef.com/problems/BIT2A?tab=statement */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class A_Books
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		   int n= sc.nextInt();
		   int []arr = new int[n];int []brr= new int[n];
		   
		   
		   for(int a=0;a<n;a++)
		   arr[a]= sc.nextInt();
		   
		   int count=0;
		   
		   for(int i=0;i<n;i++){
		       
		       for(int j=0;j<n;j++){
		       if(arr[j]>arr[i])
		       count++;
		       }
		       
		       brr[i]= count;
		       count=0;
		   }
		   for(int i=0;i<n;i++)
		   System.out.print(brr[i] + " ");
		   
		   System.out.println();
		}
	}
}
