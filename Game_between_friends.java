import java.util.Scanner;
import java.lang.*;
import java.io.*;

/*Question: Nitin and Sobhagya were playing a game with coins. If Sobhagya has more coins then he is winning, otherwise Nitin is winning. Note that this means if both Nitin and Sobhagya have the same number of coins, then Nitin is winning.

Initially Nitin has A coins while Sobhagya has B coins. Then Ritik came and gave his C coins to the player who is not winning currently, after which Satyarth came and repeated the same process (gave his D coins to the player who is not winning currently).

Find the final winner of the game. */
class Game_between_friends
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc=  new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int d= sc.nextInt();
		
		if(b>a)
		a=a+c;
		else
		b=b+c;
		
		if(b>a)
		a=a+d;
		else
		b=b+d;
		
		if(b>a)
		System.out.println("S");
		else
		System.out.println("N");
	}
	sc.close();
}
}