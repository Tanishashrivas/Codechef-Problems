/* Ques : https://www.codechef.com/submit/DIET */
import java.util.*;

class Chef_Diet
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		int n= sc.nextInt();
		int k= sc.nextInt();
		int a[]= new int[n];
		int count=0, remain=0,sum=0;
			for(int i=0;i<n;i++){
			    sum+=a[i];
			    if((a[i]+remain)>=k){
			    remain=sum-k;
			    sum=remain;
			 //   System.out.println(remain);
			    count++;
			    }
			    else{
			    break;
			    }
			}
			if(count==n)
			System.out.println("YES");
		
		}
	}
}
