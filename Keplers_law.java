import java.util.Scanner;
import java.lang.*;
import java.io.*;

/*Question : Kepler’s Law states that the planets move around the sun in elliptical orbits with the sun at one focus. Kepler's 3rd law is The Law of Periods, according to which:

The square of the time period of the planet is directly proportional to the cube of the semimajor axis of its orbit.
You are given the Time periods and axises of two planets orbiting the same star.
Please determine if the Law of Periods is satisfied or not, i.e, if the constant of proportionality of both planets is the same.*/
class Keplers_law
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc=  new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		float a= sc.nextInt();
		float b= sc.nextInt();
		float c= sc.nextInt();
		float d= sc.nextInt();
		float s1=a*a,s2=b*b;
		float r1=c*c*c,r2=d*d*d;
		if((s1/r1)==(s2/r2))
		System.out.println("Yes");
		else
		System.out.println("No");
		
	}
    sc.close();
}
}
