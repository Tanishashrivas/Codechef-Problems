/*Ques: https://www.codechef.com/problems/BROKENSTRING?tab=statement */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Mario_and_the_Broken_String
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
	    int n=sc.nextInt();
		String s= sc.next();
		boolean f=true;
		for(int i=0;i<n/2;i++){
		    if(s.charAt(i)!=s.charAt(n/2+i)){
		    f=false;
		    break;
		    }
		}
		if(f)
		System.out.println("YES");
		else
		System.out.println("NO");
		}
	}
}
