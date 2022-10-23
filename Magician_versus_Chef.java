/*Ques: https://www.codechef.com/submit/MAGICHF?tab=statement */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Magician_versus_Chef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=  new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		    
		  int n= sc.nextInt(); 
		  int x= sc.nextInt();//ball is in this box
		  int s= sc.nextInt();
		  
		  int temp=x;
		  for(int i=0;i<s;i++){
		      int a= sc.nextInt();
		      int b= sc.nextInt();
		      
		      if(temp==a)
		      temp=b;
		      else if(temp==b)
		      temp=a;
		  }
		  System.out.println(temp);
		}
	}
}
