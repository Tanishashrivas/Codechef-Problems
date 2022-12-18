/*Ques: https://www.codechef.com/problems/PLAYPIAN?tab=statement */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Play_Piano
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		String s= sc.next();
		String ans= "yes";
		for(int i=0;i<s.length();i=i+2){
		    Character ch1 = s.charAt(i);
		    Character ch2 = s.charAt(i+1);
		    if(ch1.equals(ch2)){
		    ans="no";
		    break;
		    }
		}
	System.out.println(ans);
		}
	}
}
