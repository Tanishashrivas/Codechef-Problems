/* Ques:https://www.codechef.com/problems/CHEGLOVE?tab=statement*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Chef_and_Glove
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc= new Scanner(System.in);
	    int t= sc.nextInt();
	    while(t-->0){
	       int n= sc.nextInt();
	       int arr[]= new int[n];
	       int brr[]= new int[n];
	       for(int i=0;i<n;i++)
	           arr[i]=sc.nextInt();
	       for(int i=0;i<n;i++)
	           brr[i]=sc.nextInt();
	           int countf=0,countb=0;
	       for(int i=0;i<n;i++){
	           if(arr[i]>brr[i]){
	               countf++;
	               break;
	           }
	       }
	           for(int i=0;i<n;i++){
	           if(arr[i]>brr[n-i-1]){
	               countb++;
	               break;
	           }
	           }
	       
	       if(countf==1 && countb==0)
	       System.out.println("back");
	       else if(countf==0 && countb==1 )
	       System.out.println("front"); 
	       else if(countf==0 && countb==0)
	       System.out.println("both");
	       else
	       System.out.println("none");
	    }    
	}
}
