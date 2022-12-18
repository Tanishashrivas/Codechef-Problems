/* Ques:https://www.codechef.com/problems/PRIME1?tab=statement */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Prime_Generator
{
    static boolean isprime(int n){
        
                int i,o;
                if(n<=1)
                return false;
                if(n==2)
                return true;
                if(n%2==0)
                return false;
                double e = Math.sqrt(n);
                o = (int)e;
                for(i=3;i<=o;i++)
                {
                if(n%i==0)
                return false;
                }
                return true;
		}
		
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc= new Scanner(System.in);
	    int t= sc.nextInt();
	    while(t-->0){
	        int a= sc.nextInt();
	        int b= sc.nextInt();
	        
	        for(int i=a;i<=b;i++){
	           if(isprime(i))
	           System.out.println(i);
	        }
	    }
	}
}
