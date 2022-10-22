/*Ques: https://www.codechef.com/submit/CNDLOVE*/
#include <iostream>
using namespace std;

int main() {
	int t,n;
	cin>>t;
	while(t--){
	    int sum=0;
	    cin>>n;
	    int a[n];
	    for(int i=0;i<n;i++)
	        cin>>a[i];
	    
	    for(int i=0;i<n;i++){
	       sum+=a[i]; 
	    }
	    if(sum%2==0)
	    cout<<"NO"<<endl;
	    else
	    cout<<"YES"<<endl;
	}
	return 0;
}
