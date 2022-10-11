/*Question: https://www.codechef.com/submit/SNAKPROC?tab=statement */

#include <iostream>
using namespace std;

int main() {
	int t,l;
	string s;
	cin>>t;
	while(t--){
	    int count=0;
	    cin>>l>>s;
	    for(int i=0;i<l;i++){
	        if(s[i]=='H')
	        count++;
	       else if(s[i]=='T')
	        count--;
	        
	      if(count>1||count<0){
	            break;
	        }
	    }
	    if(count==0){
	        cout<<"Valid"<<endl;
	    }
	    else{
	        cout<<"Invalid"<<endl;
	    }
	}
	return 0;
}
