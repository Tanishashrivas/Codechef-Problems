/* Ques: https://www.codechef.com/submit/BREAKSTICK?tab=statement */
import java.util.*;
import java.lang.*;
import java.io.*;


class Break_the_Stick
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		int n= sc.nextInt();
		int x= sc.nextInt();
		
		if(n%2==1 && x%2==0)
		System.out.println("NO");
		else
		System.out.println("YES");	
		}
	}
}
