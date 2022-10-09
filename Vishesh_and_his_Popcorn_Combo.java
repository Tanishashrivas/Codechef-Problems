import java.util.Scanner;

class Vishesh_and_his_Popcorn_Combo
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
		int e= sc.nextInt();
		int f= sc.nextInt();
		int s1=a+b,s2=c+d,s3=e+f;
		if(s1>=s2 && s1>=s3)
		System.out.println(s1);
		else if(s2>=s1 && s2>=s3)
		System.out.println(s2);
		else
		System.out.println(s3);
		
		}
		sc.close();
		
	}
}