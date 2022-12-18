/* Ques:https://www.codechef.com/problems/ANUUND?tab=statement */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ups_and_Downs
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc= new Scanner(System.in);
	    int t= sc.nextInt();
	    while(t-->0){
	    int n= sc.nextInt();
	    int arr[]= new int[n],temp;
	    for(int a=0;a<n;a++)
	       arr[a]= sc.nextInt();
	    
	    for(int i=0;i<n-1;i++){
	        if(i%2==0){
	            if(arr[i]>arr[i+1]){
	                temp= arr[i];
	                arr[i]= arr[i+1];
	                arr[i+1]=temp;
	            }
	        }
	            else{
	            if(arr[i]<arr[i+1]){
	                temp= arr[i];
	                arr[i]= arr[i+1];
	                arr[i+1]=temp;
	               }
	            }
	        }
	        for(int a=0;a<n;a++)
	        System.out.print(arr[a] + " ");
	        
	        System.out.println();
	    }
	}
}

