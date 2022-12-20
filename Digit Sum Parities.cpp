/* Ques: https://www.codechef.com/problems/DIGSMPAR?tab=statement*/
#include <iostream>
using namespace std;

 int answer(int n){
        int sum=0,t=n;
         while(n>0){
	        sum+=t%10;
	        t/=10;
	    }
	    return sum;
    }

int main() {
	int t;
	cin>>t;
	while(t--){
	    int n,x;
	    cin>>n;
	    int temp=answer(n)%2,temp2=answer(x)%2;
	    if(temp!= temp2)
	    cout<<n+1<<endl;
	    else
	    cout<<n+2<<endl;
	}
	return 0;
}
