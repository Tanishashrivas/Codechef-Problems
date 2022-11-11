/*Ques: https://www.codechef.com/problems/ERROR?tab=statement */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Chef_and_Feedback
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		    int c=0;
		    String s= sc.next();
		        if(s.contains("010")||s.contains("101"))
		      System.out.println("Good");
		    else
		       System.out.println("Bad");
		}
	}
}
