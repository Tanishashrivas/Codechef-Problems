/* Ques:https://www.codechef.com/problems/EQCARDGAME */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Equal_Card_Game
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc= new Scanner(System.in);
	    int t= sc.nextInt();
	    while(t-->0){
	    int k= sc.nextInt(); 
	    System.out.println(52%k);
	    }
	}
}
