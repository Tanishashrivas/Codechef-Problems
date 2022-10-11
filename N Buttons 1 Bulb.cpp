/*https://www.codechef.com/submit/ON_OFF?tab=statement*/

#include <iostream>
using namespace std;

int main() {

	int t,n;
	string s,r;
	cin>>t;
	while(t--){
	    int state=0;
	    cin>>n>>s>>r;
	    for(int i=0;i<n;i++){
	        if(s[i]!=r[i])
	        state++;
	    }
	    if(state%2==0)
	    cout<<"1"<<endl;
	    else
	    cout<<"0"<<endl;
	}
	return 0;
}
