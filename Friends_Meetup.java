/*Ques: https://www.codechef.com/submit/FRIMEET?tab=statement */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Friends_Meetup
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		    int t=sc.nextInt();
		    while(t-->0){
		       int x1=sc.nextInt();
		       int x2=sc.nextInt();
		       if(x1-x2<0)
		       System.out.println("NO");
		       else
		       System.out.println("YES");
		    }
		}
	}

