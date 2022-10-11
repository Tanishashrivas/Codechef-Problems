/*Ques: https://www.codechef.com/submit/NAICHEF?tab=statement*/

#include <iostream>
using namespace std;

int main(){
	int t;
	cin>>t;
	while(t--){
	    int n,a,b;
	    cin>>n>>a>>b;
	    int x[n];
	    float cnt_a=0,cnt_b=0;
	    for(int i=0;i<n;i++)
	   { cin>>x[i];
	       if(x[i]==a)
	    {
	        cnt_a++;
	    }
	    if(x[i]==b)
	    {
	        cnt_b++;
	    }
	   }
	   cout<<fixed<<(cnt_a*cnt_b)/(n*n)<<endl;
	}
	return 0;
}
