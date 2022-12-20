/* Ques:https://www.codechef.com/problems/PAJAPONG?tab=statement */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ping_paja_pong
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		   int x= sc.nextInt();
		   int y= sc.nextInt();
		   int k= sc.nextInt();
		   
		   int num= (x+y)/k +1;
		   if(num%2!=0)
		   System.out.println("Chef");
		   else
		   System.out.println("Paja");
		}
	}
}
