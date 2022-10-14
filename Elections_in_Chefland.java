/* Ques: https://www.codechef.com/submit/ELECTIONS */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Elections_in_Chefland
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		int x= sc.nextInt();
		int y= sc.nextInt();
		int z= sc.nextInt();
		
		if(x>50)
		System.out.println("A");
		else if(y>50)
		System.out.println("B");
		else if(z>50)
		System.out.println("C");
		else
		System.out.println("NOTA");
		}
	}
}
