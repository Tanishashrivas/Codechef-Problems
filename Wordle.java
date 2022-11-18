/*Ques: https://www.codechef.com/problems/WORDLE */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Wordle
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		String S=s.next();
		String T= s.next();
		
		for(int i=0;i<5;i++){
		    if(S.charAt(i)==T.charAt(i))
		    System.out.print("G");
		    else
		    System.out.print("B");
		}
		System.out.print("\n");
	    }		
	}
	
}
