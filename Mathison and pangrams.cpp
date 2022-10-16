/*Ques: https://www.codechef.com/submit/MATPAN?tab=statement*/
#include <iostream>
using namespace std;

int main() {
	int t,k[26],count,sum;
	string n;
	cin>>t;
	while(t--){
	    for(int i=0;i<26;i++){
	        cin>>k[i];
	    }
	    cin>>n;
	    sum=0;
	   for(int i=0;i<26;i++){
	       count=-1;
	       for(int j=0;j<n.length();j++){
	       if(int(n[j])==i+97){
	           count=0;
	       }
	       }
	        
	        if(count==-1)
	        sum+=k[i];
	   }
	    cout<<sum<<endl;
	}
	return 0;
}
