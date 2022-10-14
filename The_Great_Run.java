/* Ques: https://www.codechef.com/submit/PROC18A?tab=statement */
import java.util.*;
import java.lang.*;
import java.io.*;


class The_Great_Run
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   	Scanner sc= new Scanner(System.in);
		    int t=sc.nextInt();
 while(t-->0){
    int max=0;
	int n=sc.nextInt();
	int k=sc.nextInt();
	int arr[]= new int[n];
		   for(int i=0;i<n;i++)
		   arr[i]= sc.nextInt();
		   
		    
		    for(int i=0;i<n-k+1;i++){
		        int sum=0;
            
           for(int j=i;j<i+k;j++)
           {
              sum=sum+arr[j];
           }
            if(max<sum)
            max=sum;
		    }
		    System.out.println(max);
		    }
	}
}
