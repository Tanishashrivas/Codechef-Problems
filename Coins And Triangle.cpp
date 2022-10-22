/*Ques : https://www.codechef.com/submit/TRICOIN?tab=statement*/
#include <iostream>
using namespace std;

int main() {
	int t,n;
	cin>>t;
	while(t--){
	    int sum=0;
	    cin>>n;
	    for(int i=1;i<=n;i++){
	        sum+=i;
	       if(sum==n)
	       {
	           cout<<i<<endl;
	           break;
	       }
	       else if(sum>n)
	       {
	           cout<<i-1<<endl;
	           break;
	       }
	    }
	}
	return 0;
}
