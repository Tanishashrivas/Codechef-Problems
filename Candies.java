/*Ques:https://www.codechef.com/problems/CNDY?tab=statement */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Candies
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc= new Scanner(System.in);
	int t= sc.nextInt();
	while(t-->0){
	    int n= sc.nextInt(),count=0;
	    int arr[]= new int[2*n];
	    for(int i=0;i<2*n;i++){
	        arr[i]=sc.nextInt();
	    }
	    Arrays.sort(arr);
		     for(int i=0;i< 2*n-2;i++){
		        if(arr[i]==arr[i+1]&& arr[i]==arr[i+2]){
		            count=1;
		            break;
		        }
		    }
	       if (count == 1) {
		    System.out.println("NO");
	         }
	         else
		     System.out.println("YES");
	}
	}
}
