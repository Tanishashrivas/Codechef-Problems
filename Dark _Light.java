import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Question: Tonmoy has a special torch. The torch has 4 levels numbered 1 to 4 and 2 states (\texttt{On}On and \texttt{Off}Off). Levels 1, 2 and 3 correspond to the \text{On}On state while level 4 corresponds to the \text{Off}Off state.

The levels of the torch can be changed as:
Level 1 changes to level 2.
Level 2 changes to level 3.
Level 3 changes to level 4.
Level 4 changes to level 1.
Given the initial state as K and the number of changes made in the levels as N, find the final state of the torch. If the final state cannot be determined, print \text{Ambiguous}Ambiguous instead. */
class Dark Light
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
			Scanner sc=  new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		int n= sc.nextInt();
		int k= sc.nextInt();
		if(k==0){
		  if(n%4==0)
		System.out.println("Off");
		else
		System.out.println("On");
		}
		else{
		    if(n%4==0)
		System.out.println("On");
		else
		System.out.println("Ambiguous");
		}
	}
	}
}
